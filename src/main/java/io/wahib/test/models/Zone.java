package io.wahib.test.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.wahib.test.models.enums.Direction;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Zone {
    @Id
    @GeneratedValue
    private Long idZone;

    @Column
    private String code;

    @Column
    private String libelle;

    @Column
    @Enumerated(EnumType.STRING)
    private Direction direction;

    @Column
    private boolean actif;

    @OneToOne
    private Personnel directeur;

    @OneToMany
    private List<Personnel> gardiens;

    @OneToMany
    private List<OeuvreArt> oeuvresArts;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Musee musee;
}
