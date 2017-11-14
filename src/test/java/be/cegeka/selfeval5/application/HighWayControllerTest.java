package be.cegeka.selfeval5.application;

import be.cegeka.selfeval5.Domain.highway.HighWay;
import be.cegeka.selfeval5.Domain.highway.HighWayService;
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

public class HighWayControllerTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private HighWayController highWayController;

    @Mock
    private HighWayService highWayService;
    private HighWay highway;

    @Before
    public void setUp() throws Exception {
        highway = new HighWay("name", new BigDecimal(100.0));
    }

    @Test
    public void addHighway() throws Exception {
        highWayController.addHighway(highway);
        verify(highWayService).addHighway(highway);
    }

    @Test
    public void viewHighWays() throws Exception {
        highWayController.viewHighways();
        verify(highWayService).viewHighways();
    }
}