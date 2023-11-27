package com.bakery.demo.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Produto {

    @Id
    @Column(nullable = false, updatable = false)
    @SequenceGenerator(name = "primary_sequence", sequenceName = "primary_sequence", allocationSize = 1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "primary_sequence")
    private Integer codpro;

    @Column(nullable = false, length = 40)
    private String nompro;

    @Column(nullable = false, precision = 7, scale = 2)
    private BigDecimal vlrpro;

    @Column(nullable = false, length = 20)
    private String vldpro;

    @Column(nullable = false)
    private Integer qtdest;

    @Column(nullable = false)
    private Integer codenc;

    @Column(nullable = false)
    private Integer codcli;

    // @ManyToMany
    // @JoinTable(
    // name = "ProdutoFornecedor",
    // joinColumns = @JoinColumn(name = "codpro"),
    // inverseJoinColumns = @JoinColumn(name = "codfor")
    // )
    // private Set<Fornecedor> produtoFornecedorFornecedors;

    // @OneToMany(mappedBy = "codenc")
    // private Set<Encomenda> codproEncomendas;

    public Integer getCodpro() {
        return codpro;
    }

    public void setCodpro(final Integer codpro) {
        this.codpro = codpro;
    }

    public String getNompro() {
        return nompro;
    }

    public void setNompro(final String nompro) {
        this.nompro = nompro;
    }

    public BigDecimal getVlrpro() {
        return vlrpro;
    }

    public void setVlrpro(final BigDecimal vlrpro) {
        this.vlrpro = vlrpro;
    }

    public String getVldpro() {
        return vldpro;
    }

    public void setVldpro(final String vldpro) {
        this.vldpro = vldpro;
    }

    public Integer getQtdest() {
        return qtdest;
    }

    public void setQtdest(final Integer qtdest) {
        this.qtdest = qtdest;
    }

    public Integer getCodenc() {
        return codenc;
    }

    public void setCodenc(final Integer codenc) {
        this.codenc = codenc;
    }

    public Integer getCodcli() {
        return codcli;
    }

    public void setCodcli(final Integer codcli) {
        this.codcli = codcli;
    }

    // public Set<Fornecedor> getProdutoFornecedorFornecedors() {
    // return produtoFornecedorFornecedors;
    // }

    // public void setProdutoFornecedorFornecedors(
    // final Set<Fornecedor> produtoFornecedorFornecedors) {
    // this.produtoFornecedorFornecedors = produtoFornecedorFornecedors;
    // }

    // public Set<Encomenda> getCodproEncomendas() {
    // return codproEncomendas;
    // }

    // public void setCodproEncomendas(final Set<Encomenda> codproEncomendas) {
    // this.codproEncomendas = codproEncomendas;
    // }

}
