package be.cegeka.selfeval5.Domain.highway;

import be.cegeka.selfeval5.Application;
import org.assertj.core.api.Assertions;
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

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = Application.class)
@Transactional
public class HighWayRepositoryTest {

    @Inject
    private HighWayRepository highWayRepository;
    private HighWay highway;
    @PersistenceContext
    private EntityManager entityManager;

    @Before
    public void setUp() throws Exception {
        highway = new HighWay("name", new BigDecimal(100.0));
    }

    @Test
    public void addHighway() throws Exception {
        highWayRepository.addHighway(highway);
        assertThat(entityManager.find(HighWay.class,highway.getId())).isEqualTo(highway);
    }

    @After
    public void tearDown() throws Exception {
        entityManager.clear();
    }
}