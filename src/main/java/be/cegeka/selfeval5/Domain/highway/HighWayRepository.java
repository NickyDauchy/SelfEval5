package be.cegeka.selfeval5.Domain.highway;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Named
public class HighWayRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public HighWay addHighway(HighWay highway) {
        entityManager.persist(highway);
        return highway;
    }
}
