package org.utec.apidesercionescolarqry.model;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Nacionalidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idNacionalidad;
    private String Nacionalidad;
    private Boolean Estado;

    public Integer getIdNacionalidad() {
        return this.idNacionalidad;
    }

    public void setIdNacionalidad(Integer idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public String getNacionalidad() {
        return this.Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public Boolean getEstado() {
        return this.Estado;
    }

    public void setEstado(Boolean Estado) {
        this.Estado = Estado;
    }
}
