package be.cegeka.selfeval5.application;

import be.cegeka.selfeval5.Domain.highway.HighWay;
import be.cegeka.selfeval5.Domain.highway.HighWayService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;


@RestController
@RequestMapping(path = "/highway")
@Transactional
public class HighWayController {
    @Inject
    private HighWayService highWayService;

    @PostMapping (consumes = MediaType.APPLICATION_JSON_VALUE)
    public HighWay addHighway(HighWay highway) {
        return highWayService.addHighway(highway);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<HighWay> viewHighways() {
        return highWayService.viewHighways();
    }
}
