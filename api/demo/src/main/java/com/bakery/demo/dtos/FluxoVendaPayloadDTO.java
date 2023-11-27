package com.bakery.demo.dtos;
import java.util.Set;



public class FluxoVendaPayloadDTO {
    private Set<ProdutoFluxoVendaDTO> produtos;
    private Integer cnpjPadaria;
    private Integer clienteId;
    
    public Integer getCnpjPadaria() {
        return cnpjPadaria;
    }
    public void setCnpjPadaria(Integer cnpjPadaria) {
        this.cnpjPadaria = cnpjPadaria;
    }
    public Integer getClienteId() {
        return clienteId;
    }
    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }
    public Set<ProdutoFluxoVendaDTO> getProdutos() {
        return produtos;
    }
    public void setProdutos(Set<ProdutoFluxoVendaDTO> produtos) {
        this.produtos = produtos;
    }    
}
