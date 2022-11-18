package io.wahib.test.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Musee {
    @Id
    @GeneratedValue
    private  Long idMusee;

    @Column
    private Date dateInauguration;

    @Column
    private String designation;

    @Column
    private String adresse;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Zone> zones;
}
