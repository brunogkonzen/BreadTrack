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
import java.math.BigDecimal;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
public class Conta {

    @Id
    @Column(nullable = false, updatable = false)
    @SequenceGenerator(name = "conta_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "conta_id_seq")
    private Integer codcon;

    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal debcon;

    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal crecon;

    @Column(nullable = false)
    private LocalDate datcon;

    @Column(nullable = false, precision = 11, scale = 0)
    private BigDecimal cpfcli;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codcli", nullable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Cliente cliente;

    public Integer getCodcon() {
        return codcon;
    }

    public void setCodcon(final Integer codcon) {
        this.codcon = codcon;
    }

    public BigDecimal getDebcon() {
        return debcon;
    }

    public void setDebcon(final BigDecimal debcon) {
        this.debcon = debcon;
    }

    public BigDecimal getCrecon() {
        return crecon;
    }

    public void setCrecon(final BigDecimal crecon) {
        this.crecon = crecon;
    }

    public LocalDate getDatcon() {
        return datcon;
    }

    public void setDatcon(final LocalDate datcon) {
        this.datcon = datcon;
    }

    public BigDecimal getCpfcli() {
        return cpfcli;
    }

    public void setCpfcli(final BigDecimal cpfcli) {
        this.cpfcli = cpfcli;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(final Cliente cliente) {
        this.cliente = cliente;
    }

}
