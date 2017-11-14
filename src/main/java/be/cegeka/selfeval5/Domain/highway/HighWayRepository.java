package be.cegeka.selfeval5.Domain.highway;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Named
public class HighWayRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public HighWay addHighway(HighWay highway) {
        entityManager.persist(highway);
        return highway;
    }

    public List<HighWay> viewHighways() {
        return entityManager.createQuery("select h from HighWay h",HighWay.class).getResultList();
    }
}
