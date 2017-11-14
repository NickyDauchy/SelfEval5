package be.cegeka.selfeval5.Domain.highwayIncident;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class HighWayIncidentService {
    @Inject
    private HighWayIncidentRepository highWayIncidentRepository;

    public HighWayIncident reportHighwayIncident(HighWayIncident highWayIncident) {
        return highWayIncidentRepository.reportHighwayIncident(highWayIncident);
    }
}
