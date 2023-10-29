package org.utec.apidesercionescolarqry.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class RecursosBasicos implements Serializable {

    @Id
    private Integer idRecursoBasico;
    private String nombreRecurso;
    private Boolean estado;


    public RecursosBasicos() {
    }

    public RecursosBasicos(Integer idRecursoBasico, String nombreRecurso, Boolean estado) {
        this.idRecursoBasico = idRecursoBasico;
        this.nombreRecurso = nombreRecurso;
        this.estado = estado;
    }

    public Integer getIdRecursoBasico() {
        return idRecursoBasico;
    }

    public void setIdRecursoBasico(Integer idRecursoBasico) {
        this.idRecursoBasico = idRecursoBasico;
    }

    public String getNombreRecurso() {
        return nombreRecurso;
    }

    public void setNombreRecurso(String nombreRecurso) {
        this.nombreRecurso = nombreRecurso;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
