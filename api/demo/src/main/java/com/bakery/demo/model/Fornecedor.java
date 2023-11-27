package com.bakery.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;


@Entity
public class Fornecedor {

    @Id
    @Column(nullable = false, updatable = false)
    @SequenceGenerator(
            name = "fornecedor_id_seq",
            sequenceName = "fornecedor_id_seq",
            allocationSize = 1,
            initialValue = 10000
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "fornecedor_id_seq"
    )
    private Integer codfor;

    @Column(nullable = false, length = 40)
    private String nomfor;

    @Column(nullable = false, length = 40)
    private String marfor;

    @Column(length = 20)
    private String telfor;

    public Integer getCodfor() {
        return codfor;
    }

    public void setCodfor(final Integer codfor) {
        this.codfor = codfor;
    }

    public String getNomfor() {
        return nomfor;
    }

    public void setNomfor(final String nomfor) {
        this.nomfor = nomfor;
    }

    public String getMarfor() {
        return marfor;
    }

    public void setMarfor(final String marfor) {
        this.marfor = marfor;
    }

    public String getTelfor() {
        return telfor;
    }

    public void setTelfor(final String telfor) {
        this.telfor = telfor;
    }
}
