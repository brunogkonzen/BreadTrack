package com.bakery.demo.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class VendaDTO {

    private String nomeCliente;
    private String nomePadaria;
    private LocalDate dataVenda;
    private BigDecimal valorVenda;
    private BigDecimal cpfCliente;
    private List<ProductDTO> produtos;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomePadaria() {
        return nomePadaria;
    }

    public void setNomePadaria(String nomePadaria) {
        this.nomePadaria = nomePadaria;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }

    public BigDecimal getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(BigDecimal cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public List<ProductDTO> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProductDTO> produtos) {
        this.produtos = produtos;
    }

}
