package org.utec.apidesercionescolarqry.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.json.bind.annotation.JsonbDateFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VwDetaMatriculaAlumno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetalleMatriculaAlumno;
    private Integer idAlumno;
    private String nombreGrado;
    private String nombreTurno;
    private String nombreInstitucion;
    private String nombreModalidad;
    private Integer idEstadoMatricula;
    @JsonbDateFormat("dd/MM/yyyy")
    private LocalDate AnioLectivo;
    @JsonbDateFormat("dd/MM/yyyy")
    private LocalDateTime FechaMatricula;

    public String getNombreGrado() {
        return this.nombreGrado;
    }

    public void setNombreGrado(String nombreGrado) {
        this.nombreGrado = nombreGrado;
    }

    public String getNombreTurno() {
        return this.nombreTurno;
    }

    public void setNombreTurno(String nombreTurno) {
        this.nombreTurno = nombreTurno;
    }

    public String getNombreInstitucion() {
        return this.nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public String getNombreModalidad() {
        return this.nombreModalidad;
    }

    public void setNombreModalidad(String nombreModalidad) {
        this.nombreModalidad = nombreModalidad;
    }

    public Integer getIdDetalleMatriculaAlumno() {
        return this.idDetalleMatriculaAlumno;
    }

    public void setIdDetalleMatriculaAlumno(Integer idDetalleMatriculaAlumno) {
        this.idDetalleMatriculaAlumno = idDetalleMatriculaAlumno;
    }

    public Integer getIdAlumno() {
        return this.idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }


    public Integer getIdEstadoMatricula() {
        return this.idEstadoMatricula;
    }

    public void setIdEstadoMatricula(Integer idEstadoMatricula) {
        this.idEstadoMatricula = idEstadoMatricula;
    }

    public LocalDate getAnioLectivo() {
        return this.AnioLectivo;
    }

    public void setAnioLectivo(LocalDate AnioLectivo) {
        this.AnioLectivo = AnioLectivo;
    }

    public LocalDateTime getFechaMatricula() {
        return this.FechaMatricula;
    }

    public void setFechaMatricula(LocalDateTime FechaMatricula) {
        this.FechaMatricula = FechaMatricula;
    }

}
