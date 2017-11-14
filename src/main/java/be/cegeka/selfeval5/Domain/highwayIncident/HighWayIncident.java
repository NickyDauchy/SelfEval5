package be.cegeka.selfeval5.Domain.highwayIncident;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "HIGHWAY_INCIDENTS")

public class HighWayIncident {
    @Id
    @Column(name = "HIGHWAY_INCIDENT_ID ")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "HIGHWAY_INCIDENT_NAME")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "HIGHWAY_INCIDENT_TYPE")
    private HighWayIncidentType highWayIncidentType;

    @Column(name = "HIGHWAY_INCIDENT_DISTANCE")
    private BigDecimal highwayIncidentDistence;

    @Column(name = "USER_ID")
    private int userId;

    //    @ManyToOne
    @Column(name = "HIGHWAY_ID")
    private int highwayId;

    private HighWayIncident() {
    }

    public HighWayIncident(int userId, int highwayId, String name, HighWayIncidentType highWayIncidentType, BigDecimal highwayIncidentDistence) {
        this.userId = userId;
        this.highwayId = highwayId;
        this.name = name;
        this.highWayIncidentType = highWayIncidentType;
        this.highwayIncidentDistence = highwayIncidentDistence;
    }

    public Object getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HighWayIncidentType getHighWayIncidentType() {
        return highWayIncidentType;
    }

    public BigDecimal getHighwayIncidentDistence() {
        return highwayIncidentDistence;
    }

    public int getUserId() {
        return userId;
    }

    public int getHighwayId() {
        return highwayId;
    }
}
