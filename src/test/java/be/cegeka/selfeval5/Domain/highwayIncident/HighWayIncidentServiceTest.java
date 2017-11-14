package be.cegeka.selfeval5.Domain.highwayIncident;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.math.BigDecimal;

import static org.mockito.Mockito.verify;

public class HighWayIncidentServiceTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private HighWayIncidentService highWayIncidentService;

    @Mock
    private HighWayIncidentRepository highWayIncidentRepository;
    private HighWayIncident highWayIncident;

    @Before
    public void setUp() throws Exception {
        highWayIncident = new HighWayIncident(1,1,"name", HighWayIncidentType.TRAFFIC_JAM, new BigDecimal(100.0));
    }

    @Test
    public void reportHighwayIncident() throws Exception {
        highWayIncidentService.reportHighwayIncident(highWayIncident);
        verify(highWayIncidentRepository).reportHighwayIncident(highWayIncident);
    }


}