package be.cegeka.selfeval5.Domain.User;

import be.cegeka.selfeval5.Domain.highway.HighWay;
import be.cegeka.selfeval5.Domain.highwayIncident.HighWayIncident;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USERS")
public class User{
    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "USER_NAME")
    private String name;

    @OneToMany
    @JoinColumn(name = "USER_ID")
    private List<HighWayIncident> highWayIncidentList;


    private User() {
    }
}
