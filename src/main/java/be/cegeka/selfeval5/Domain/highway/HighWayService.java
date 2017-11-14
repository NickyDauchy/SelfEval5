package be.cegeka.selfeval5.Domain.highway;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class HighWayService {
    @Inject
    private HighWayRepository highwayRepository;

    public HighWay addHighway(HighWay highway) {
        return highwayRepository.addHighway(highway);
    }
}
