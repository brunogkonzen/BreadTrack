package com.bakery.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Padaria {

    @Id
    @Column(nullable = false, updatable = false, unique = true)
    private Integer cnpj;

    @Column(nullable = false, length = 40)
    private String nomfanpad;

    @Column(nullable = false, length = 80)
    private String endpad;

    @Column(length = 20)
    private String telpad;

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(final Integer cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomfanpad() {
        return nomfanpad;
    }

    public void setNomfanpad(final String nomfanpad) {
        this.nomfanpad = nomfanpad;
    }

    public String getEndpad() {
        return endpad;
    }

    public void setEndpad(final String endpad) {
        this.endpad = endpad;
    }

    public String getTelpad() {
        return telpad;
    }

    public void setTelpad(final String telpad) {
        this.telpad = telpad;
    }
}
