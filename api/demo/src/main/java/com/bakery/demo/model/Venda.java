package com.bakery.demo.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Venda {

    @Id
    @Column(nullable = false, updatable = false)
    @SequenceGenerator(name = "venda_id_sq", sequenceName = "venda_id_sq", allocationSize = 1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "venda_id_sq")
    private Integer codven;

    @Column(nullable = false)
    private LocalDate datven;

    @Column(nullable = false)
    private Integer qtdven;

    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal vlrven;

    @Column(precision = 11, scale = 0)
    private BigDecimal cpfcli;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "cnpj", nullable = false)
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Padaria padaria;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "codcli", nullable = false)
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Cliente cliente;

    public Integer getCodven() {
        return codven;
    }

    public void setCodven(final Integer codven) {
        this.codven = codven;
    }

    public LocalDate getDatven() {
        return datven;
    }

    public void setDatven(final LocalDate datven) {
        this.datven = datven;
    }

    public Integer getQtdven() {
        return qtdven;
    }

    public void setQtdven(final Integer qtdven) {
        this.qtdven = qtdven;
    }

    public BigDecimal getVlrven() {
        return vlrven;
    }

    public void setVlrven(final BigDecimal vlrven) {
        this.vlrven = vlrven;
    }

    public BigDecimal getCpfcli() {
        return cpfcli;
    }

    public void setCpfcli(final BigDecimal cpfcli) {
        this.cpfcli = cpfcli;
    }

    public Padaria getPadaria() {
        return padaria;
    }

    public void setPadaria(final Padaria padaria) {
        this.padaria = padaria;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(final Cliente cliente) {
        this.cliente = cliente;
    }
}
