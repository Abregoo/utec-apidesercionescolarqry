package org.utec.apidesercionescolarqry.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ConvivenciaFamiliar implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idConvivenciaFamiliar;
    private String NombreConvivenciaFamiliar;
    private Boolean Estado;

    public Integer getIdConvivenciaFamiliar() {
        return this.idConvivenciaFamiliar;
    }

    public void setIdConvivenciaFamiliar(Integer idConvivenciaFamiliar) {
        this.idConvivenciaFamiliar = idConvivenciaFamiliar;
    }

    public String getNombreConvivenciaFamiliar() {
        return this.NombreConvivenciaFamiliar;
    }

    public void setNombreConvivenciaFamiliar(String NombreConvivenciaFamiliar) {
        this.NombreConvivenciaFamiliar = NombreConvivenciaFamiliar;
    }

    public Boolean getEstado() {
        return this.Estado;
    }

    public void setEstado(Boolean Estado) {
        this.Estado = Estado;
    }

}
