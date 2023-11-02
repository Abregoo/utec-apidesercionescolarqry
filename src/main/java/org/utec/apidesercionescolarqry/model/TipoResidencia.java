package org.utec.apidesercionescolarqry.model;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TipoResidencia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTipoResidencia;
    private String NombreResidencia;
    private Boolean Estado;

    public Integer getIdTipoResidencia() {
        return this.idTipoResidencia;
    }

    public void setIdTipoResidencia(Integer idTipoResidencia) {
        this.idTipoResidencia = idTipoResidencia;
    }

    public String getNombreResidencia() {
        return this.NombreResidencia;
    }

    public void setNombreResidencia(String NombreResidencia) {
        this.NombreResidencia = NombreResidencia;
    }

    public Boolean getEstado() {
        return this.Estado;
    }

    public void setEstado(Boolean Estado) {
        this.Estado = Estado;
    }
}
