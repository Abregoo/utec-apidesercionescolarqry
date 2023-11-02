package org.utec.apidesercionescolarqry.model;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TipoVivienda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTipoVivienda;
    private String nombreTipoVivienda;
    private Boolean estado;

    public Integer getIdTipoVivienda() {
        return this.idTipoVivienda;
    }

    public void setIdTipoVivienda(Integer idTipoVivienda) {
        this.idTipoVivienda = idTipoVivienda;
    }

    public String getNombreTipoVivienda() {
        return this.nombreTipoVivienda;
    }

    public void setNombreTipoVivienda(String nombreTipoVivienda) {
        this.nombreTipoVivienda = nombreTipoVivienda;
    }

    public Boolean getEstado() {
        return this.estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
