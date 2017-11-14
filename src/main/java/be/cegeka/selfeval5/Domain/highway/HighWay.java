package be.cegeka.selfeval5.Domain.highway;

import javax.inject.Inject;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "HIGHWAYS")
public class HighWay {
    @Id
    @Column(name = "HIGHWAY_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "HIGHWAY_NAME")
    private String name;
    @Column(name = "HIGHWAY_DISTANCE")
    private BigDecimal distance;

    private HighWay() {
    }

    public HighWay(String name, BigDecimal distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getDistance() {
        return distance;
    }

    public int getId() {return id; }
}
