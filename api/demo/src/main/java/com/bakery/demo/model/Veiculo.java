package com.bakery.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Veiculo {

    @Id
    @Column(nullable = false, updatable = false, length = 7)
    private String plavei;

    @Column(nullable = false, length = 20)
    private String modvei;

    @Column(nullable = false)
    private Integer anovei;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cnpj_id", nullable = false)
    private Padaria cnpj;

    public String getPlavei() {
        return plavei;
    }

    public void setPlavei(final String plavei) {
        this.plavei = plavei;
    }

    public String getModvei() {
        return modvei;
    }

    public void setModvei(final String modvei) {
        this.modvei = modvei;
    }

    public Integer getAnovei() {
        return anovei;
    }

    public void setAnovei(final Integer anovei) {
        this.anovei = anovei;
    }

    public Padaria getCnpj() {
        return cnpj;
    }

    public void setCnpj(final Padaria cnpj) {
        this.cnpj = cnpj;
    }

}
