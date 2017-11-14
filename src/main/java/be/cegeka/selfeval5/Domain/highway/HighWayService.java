package be.cegeka.selfeval5.Domain.highway;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class HighWayService {
    @Inject
    private HighWayRepository highwayRepository;

    public HighWay addHighway(HighWay highway) {
        return highwayRepository.addHighway(highway);
    }

    public List<HighWay> viewHighways() {
        return highwayRepository.viewHighways();
    }
}
