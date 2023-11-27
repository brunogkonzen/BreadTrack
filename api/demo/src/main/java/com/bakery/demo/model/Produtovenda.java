package com.bakery.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class Produtovenda {
    @EmbeddedId
    ProdutovendaKey id;

    @ManyToOne()
    @MapsId("codven")
    @JoinColumn(name = "codven")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Venda venda;
    
    @ManyToOne()
    @MapsId("codpro")
    @JoinColumn(name = "codpro")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Produto produto;

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public ProdutovendaKey getId() {
        return id;
    }

    public void setId(ProdutovendaKey id) {
        this.id = id;
    }


}
