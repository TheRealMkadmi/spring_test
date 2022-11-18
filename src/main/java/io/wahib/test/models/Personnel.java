package io.wahib.test.models;

import io.wahib.test.models.enums.TypePersonnel;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Personnel {
    @Id
    @GeneratedValue
    private Long idPersonnel;

    @Column
    private String nomPersonnel;

    @Column
    private String prenomPersonnel;

    @Column
    private Date dateDerniereAffectation;

    @Column
    private TypePersonnel typePersonnel;

}
