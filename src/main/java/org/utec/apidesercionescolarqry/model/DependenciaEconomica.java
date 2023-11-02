package org.utec.apidesercionescolarqry.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DependenciaEconomica implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDependenciaEconomica;
    private String nombreDependenciaEconomica;
    private Boolean Estado;

    public Integer getIdDependenciaEconomica() {
        return this.idDependenciaEconomica;
    }

    public void setIdDependenciaEconomica(Integer idDependenciaEconomica) {
        this.idDependenciaEconomica = idDependenciaEconomica;
    }

    public String getNombreDependenciaEconomica() {
        return this.nombreDependenciaEconomica;
    }

    public void setNombreDependenciaEconomica(String nombreDependenciaEconomica) {
        this.nombreDependenciaEconomica = nombreDependenciaEconomica;
    }

    public Boolean getEstado() {
        return this.Estado;
    }

    public void setEstado(Boolean Estado) {
        this.Estado = Estado;
    }
    
}
