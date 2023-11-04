package org.utec.apidesercionescolarqry.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.json.bind.annotation.JsonbDateFormat;

@Entity
public class Alumno implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAlumno;
    private Integer idDependenciaEconomica;
    private Integer idTipoResidencia;
    private Integer idConvivenciaFamiliar;
    private Integer idRecursoBasico;
    private Integer idTipoVivienda;
    private Integer idNacionalidad;
    private Integer idSexo;
    private String direccionResidencia;
    private Integer cantidadHermanos;
    @JsonbDateFormat("dd/MM/yyyy")
    private LocalDate anioNacimiento; 
    private Boolean estado;

    private BigDecimal probabilidad;

    public Integer getIdAlumno() {
        return this.idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Integer getIdDependenciaEconomica() {
        return this.idDependenciaEconomica;
    }

    public void setIdDependenciaEconomica(Integer idDependenciaEconomica) {
        this.idDependenciaEconomica = idDependenciaEconomica;
    }

    public Integer getIdTipoResidencia() {
        return this.idTipoResidencia;
    }

    public void setIdTipoResidencia(Integer idTipoResidencia) {
        this.idTipoResidencia = idTipoResidencia;
    }

    public Integer getIdConvivenciaFamiliar() {
        return this.idConvivenciaFamiliar;
    }

    public void setIdConvivenciaFamiliar(Integer idConvivenciaFamiliar) {
        this.idConvivenciaFamiliar = idConvivenciaFamiliar;
    }

    public Integer getIdRecursoBasico() {
        return this.idRecursoBasico;
    }

    public void setIdRecursoBasico(Integer idRecursoBasico) {
        this.idRecursoBasico = idRecursoBasico;
    }

    public Integer getIdTipoVivienda() {
        return this.idTipoVivienda;
    }

    public void setIdTipoVivienda(Integer idTipoVivienda) {
        this.idTipoVivienda = idTipoVivienda;
    }

    public Integer getIdNacionalidad() {
        return this.idNacionalidad;
    }

    public void setIdNacionalidad(Integer idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public Integer getIdSexo() {
        return this.idSexo;
    }

    public void setIdSexo(Integer idSexo) {
        this.idSexo = idSexo;
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

    public BigDecimal getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(BigDecimal probabilidad) {
        this.probabilidad = probabilidad;
    }

}
