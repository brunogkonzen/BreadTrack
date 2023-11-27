package com.bakery.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import java.time.LocalDate;


@Entity
public class Funcionario {

    @Id
    @Column(nullable = false, updatable = false)
    @SequenceGenerator(
            name = "primary_sequence",
            sequenceName = "primary_sequence",
            allocationSize = 1,
            initialValue = 10000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "primary_sequence"
    )
    private Integer codfun;

    @Column(nullable = false, length = 40)
    private String nomfun;

    @Column
    private Boolean sexfun;

    @Column
    private LocalDate datnasfun;

    @Column(nullable = false, length = 20)
    private String carhorfun;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codset_id", nullable = false)
    private Setor codset;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cnpj_id", nullable = false)
    private Padaria cnpj;

    public Integer getCodfun() {
        return codfun;
    }

    public void setCodfun(final Integer codfun) {
        this.codfun = codfun;
    }

    public String getNomfun() {
        return nomfun;
    }

    public void setNomfun(final String nomfun) {
        this.nomfun = nomfun;
    }

    public Boolean getSexfun() {
        return sexfun;
    }

    public void setSexfun(final Boolean sexfun) {
        this.sexfun = sexfun;
    }

    public LocalDate getDatnasfun() {
        return datnasfun;
    }

    public void setDatnasfun(final LocalDate datnasfun) {
        this.datnasfun = datnasfun;
    }

    public String getCarhorfun() {
        return carhorfun;
    }

    public void setCarhorfun(final String carhorfun) {
        this.carhorfun = carhorfun;
    }

    public Setor getCodset() {
        return codset;
    }

    public void setCodset(final Setor codset) {
        this.codset = codset;
    }

    public Padaria getCnpj() {
        return cnpj;
    }

    public void setCnpj(final Padaria cnpj) {
        this.cnpj = cnpj;
    }

}
