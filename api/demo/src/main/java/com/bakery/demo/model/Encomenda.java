package com.bakery.demo.model;

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
import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Encomenda {

    @Id
    @Column(nullable = false, updatable = false)
    @SequenceGenerator(name = "encomenda_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "encomenda_id_seq")
    private Integer codenc;

    @Column(nullable = false)
    private LocalDate datenc;

    @Column(nullable = false, length = 40)
    private String endenc;

    @Column(nullable = false, length = 120)
    private String proenc;

    @Column(nullable = false, precision = 11, scale = 0)
    @JsonIgnore
    private BigDecimal cpfcli;

    @Column(nullable = false)
    private Integer qtdproenc;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "codcli", nullable = false)
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "codpro", nullable = false)
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Produto produto;

    public Integer getCodenc() {
        return codenc;
    }

    public void setCodenc(final Integer codenc) {
        this.codenc = codenc;
    }

    public LocalDate getDatenc() {
        return datenc;
    }

    public void setDatenc(final LocalDate datenc) {
        this.datenc = datenc;
    }

    public String getEndenc() {
        return endenc;
    }

    public void setEndenc(final String endenc) {
        this.endenc = endenc;
    }

    public String getProenc() {
        return proenc;
    }

    public void setProenc(final String proenc) {
        this.proenc = proenc;
    }

    public BigDecimal getCpfcli() {
        return cpfcli;
    }

    public void setCpfcli(final BigDecimal cpfcli) {
        this.cpfcli = cpfcli;
    }

    public Integer getQtdproenc() {
        return qtdproenc;
    }

    public void setQtdproenc(final Integer qtdproenc) {
        this.qtdproenc = qtdproenc;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(final Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(final Produto produto) {
        this.produto = produto;
    }

}
