package be.cegeka.selfeval5.Domain.highway;

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

public class HighWayServiceTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private HighWayService highWayService;

    @Mock
    private HighWayRepository highWayRepository;
    private HighWay highway;

    @Before
    public void setUp() throws Exception {
        highway = new HighWay("name", new BigDecimal(100.0));
    }

    @Test
    public void addHighway() throws Exception {
        highWayService.addHighway(highway);
        verify(highWayRepository).addHighway(highway);
    }

    @Test
    public void viewHighWays() throws Exception {
        highWayService.viewHighways();
        verify(highWayRepository).viewHighways();
    }

}