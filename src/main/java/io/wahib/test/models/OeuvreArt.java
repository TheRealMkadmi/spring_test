package io.wahib.test.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class OeuvreArt {
    @Id
    @GeneratedValue
    private Long idOeuvreArt;

    @Column
    private String artiste;

    @Column
    private String titreTableau;

    @ManyToOne
    private Zone zone;
}
