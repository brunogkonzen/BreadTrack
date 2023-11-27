package com.bakery.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ProdutovendaKey {
    
    @Column(name = "codven")
    Integer codven;

    @Column(name = "codpro")
    Integer codpro;

    public Integer getCodven() {
        return codven;
    }

    public void setCodven(Integer codven) {
        this.codven = codven;
    }

    public Integer getCodpro() {
        return codpro;
    }

    public void setCodpro(Integer codpro) {
        this.codpro = codpro;
    }


    
}
