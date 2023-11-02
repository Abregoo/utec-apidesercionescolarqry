package org.utec.apidesercionescolarqry.model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.json.bind.annotation.JsonbDateFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VwAlumno implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAlumno;
    private String nombreDependenciaEconomica;
    private String nombreResidencia;
    private String nombreConvivenciaFamiliar;
    private String nombreRecurso;
    private String nombreTipoVivienda;
    private String nacionalidad;
    private String sexo;
    private String direccionResidencia;
    private Integer cantidadHermanos;
    @JsonbDateFormat("dd/MM/yyyy")
    private LocalDate anioNacimiento;
    private Boolean estado;

    public Integer getIdAlumno() {
        return this.idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombreDependenciaEconomica() {
        return this.nombreDependenciaEconomica;
    }

    public void setNombreDependenciaEconomica(String nombreDependenciaEconomica) {
        this.nombreDependenciaEconomica = nombreDependenciaEconomica;
    }

    public String getNombreResidencia() {
        return this.nombreResidencia;
    }

    public void setNombreResidencia(String nombreResidencia) {
        this.nombreResidencia = nombreResidencia;
    }

    public String getNombreConvivenciaFamiliar() {
        return this.nombreConvivenciaFamiliar;
    }

    public void setNombreConvivenciaFamiliar(String nombreConvivenciaFamiliar) {
        this.nombreConvivenciaFamiliar = nombreConvivenciaFamiliar;
    }

    public String getNombreRecurso() {
        return this.nombreRecurso;
    }

    public void setNombreRecurso(String nombreRecurso) {
        this.nombreRecurso = nombreRecurso;
    }

    public String getNombreTipoVivienda() {
        return this.nombreTipoVivienda;
    }

    public void setNombreTipoVivienda(String nombreTipoVivienda) {
        this.nombreTipoVivienda = nombreTipoVivienda;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccionResidencia() {
        return this.direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public Integer getCantidadHermanos() {
        return this.cantidadHermanos;
    }

    public void setCantidadHermanos(Integer cantidadHermanos) {
        this.cantidadHermanos = cantidadHermanos;
    }

    public LocalDate getAnioNacimiento() {
        return this.anioNacimiento;
    }

    public void setAnioNacimiento(LocalDate anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public Boolean getEstado() {
        return this.estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }



}
