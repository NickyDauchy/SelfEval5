package be.cegeka.selfeval5.application;

import be.cegeka.selfeval5.Domain.highwayIncident.HighWayIncident;
import be.cegeka.selfeval5.Domain.highwayIncident.HighWayIncidentService;
import be.cegeka.selfeval5.Domain.highwayIncident.HighWayIncidentType;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.math.BigDecimal;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class HighWayIncidentControllerTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private HighWayIncidentController highWayController;

    @Mock
    private HighWayIncidentService highWayIncidentService;
    private HighWayIncident highWayIncident;

    @Before
    public void setUp() throws Exception {
        highWayIncident = new HighWayIncident(1,1,"name", HighWayIncidentType.TRAFFIC_JAM, new BigDecimal(100.0));
    }

    @Test
    public void reportHighwayIncident() throws Exception {
        highWayController.reportHighwayIncident(highWayIncident);
        verify(highWayIncidentService).reportHighwayIncident(highWayIncident);
    }

}