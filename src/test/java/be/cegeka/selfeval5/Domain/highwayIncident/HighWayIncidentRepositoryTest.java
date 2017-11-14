package be.cegeka.selfeval5.Domain.highwayIncident;

import be.cegeka.selfeval5.Application;
import be.cegeka.selfeval5.Domain.highway.HighWay;
import be.cegeka.selfeval5.Domain.highway.HighWayRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = Application.class)
@Transactional
public class HighWayIncidentRepositoryTest {

    @Inject
    private HighWayIncidentRepository highWayIncidentRepository;
    private HighWayIncident highWayIncident;

    @PersistenceContext
    private EntityManager entityManager;
    private HighWay highway;

    @Before
    public void setUp() throws Exception {
        highway = new HighWay("name", new BigDecimal(100.0));
        entityManager.persist(highway);
        highWayIncident = new HighWayIncident(1,highway.getId(),"name", HighWayIncidentType.TRAFFIC_JAM, new BigDecimal(100.0));
    }

    @Test
    public void reportHighwayIncident() throws Exception {
        highWayIncidentRepository.reportHighwayIncident(highWayIncident);
        assertThat(entityManager.find(HighWayIncident.class,highWayIncident.getId())).isEqualTo(highWayIncident);

    }

    @After
    public void tearDown() throws Exception {
        entityManager.clear();
    }
}