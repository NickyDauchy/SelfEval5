package be.cegeka.selfeval5.Domain.highwayIncident;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Named
public class HighWayIncidentRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public HighWayIncident reportHighwayIncident(HighWayIncident highWayIncident) {
        entityManager.persist(highWayIncident);
        return highWayIncident;
    }
}
