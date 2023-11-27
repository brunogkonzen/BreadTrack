package com.bakery.demo.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Cliente {

    @Id
    @Column(nullable = false, updatable = false)
    @SequenceGenerator(name = "cliente_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "cliente_id_seq")
    private Integer codcli;

    @Column(nullable = false, precision = 11, scale = 0)
    private BigDecimal cpfcli;

    @Column(nullable = false, length = 40)
    private String nomcli;

    @Column
    private LocalDate datnascli;

    @Column(length = 20)
    private String telcli;

    @Column(nullable = false, length = 80)
    private String endcli;

    @Column(nullable = false)
    private String sexcli;

    @Column(nullable = false)
    private LocalDate datcadcli;

    public Integer getCodcli() {
        return codcli;
    }

    public void setCodcli(final Integer codcli) {
        this.codcli = codcli;
    }

    public BigDecimal getCpfcli() {
        return cpfcli;
    }

    public void setCpfcli(final BigDecimal cpfcli) {
        this.cpfcli = cpfcli;
    }

    public String getNomcli() {
        return nomcli;
    }

    public void setNomcli(final String nomcli) {
        this.nomcli = nomcli;
    }

    public LocalDate getDatnascli() {
        return datnascli;
    }

    public void setDatnascli(final LocalDate datnascli) {
        this.datnascli = datnascli;
    }

    public String getTelcli() {
        return telcli;
    }

    public void setTelcli(final String telcli) {
        this.telcli = telcli;
    }

    public String getEndcli() {
        return endcli;
    }

    public void setEndcli(final String endcli) {
        this.endcli = endcli;
    }

    public String getSexcli() {
        return sexcli;
    }

    public void setSexcli(final String sexcli) {
        this.sexcli = sexcli;
    }

    public LocalDate getDatcadcli() {
        return datcadcli;
    }

    public void setDatcadcli(final LocalDate datcadcli) {
        this.datcadcli = datcadcli;
    }
}
