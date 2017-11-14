package be.cegeka.selfeval5.application;

import be.cegeka.selfeval5.Domain.highwayIncident.HighWayIncident;
import be.cegeka.selfeval5.Domain.highwayIncident.HighWayIncidentService;
import be.cegeka.selfeval5.Domain.highway.HighWay;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;


@RestController
@RequestMapping(path = "/highwayIncident")
@Transactional
public class HighWayIncidentController {
    @Inject
    private HighWayIncidentService highWayIncidentService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public HighWayIncident reportHighwayIncident(HighWayIncident highWayIncident) {
        return highWayIncidentService.reportHighwayIncident(highWayIncident);
    }


}
