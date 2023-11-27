package com.bakery.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;


@Entity
public class Setor {

    @Id
    @Column(nullable = false, updatable = false)
    
    @SequenceGenerator(
            name = "setor_id_seq",
            sequenceName = "setor_id_seq",
            allocationSize = 1,
            initialValue = 10000
    )
    
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "setor_id_seq"
    )
    
    private Integer codset;

    @Column(nullable = false, length = 40)
    private String funset;

    @Column(nullable = false, length = 40)
    private String nomset;

    public Integer getCodset() {
        return codset;
    }

    public void setCodset(final Integer codset) {
        this.codset = codset;
    }

    public String getFunset() {
        return funset;
    }

    public void setFunset(final String funset) {
        this.funset = funset;
    }

    public String getNomset() {
        return nomset;
    }

    public void setNomset(final String nomset) {
        this.nomset = nomset;
    }
}
