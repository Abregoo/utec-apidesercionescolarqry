package org.utec.apidesercionescolarqry.model;

import java.io.Serializable;
import java.time.LocalDate; 

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.json.bind.annotation.JsonbDateFormat;
import java.time.LocalDateTime;
@Entity
public class DetalleMatriculaAlumno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetalleMatriculaAlumno;
    private Integer idGrado;
    private Integer idAlumno;
    private Integer idTurno;
    private Integer idInstitucion;
    private Integer idModalidad;
    private Integer idEstadoMatricula;
    @JsonbDateFormat("dd/MM/yyyy")
    private LocalDate AnioLectivo;
    @JsonbDateFormat("dd/MM/yyyy")
    private LocalDateTime FechaMatricula;

    
    public Integer getIdDetalleMatriculaAlumno() {
        return this.idDetalleMatriculaAlumno;
    }

    public void setIdDetalleMatriculaAlumno(Integer idDetalleMatriculaAlumno) {
        this.idDetalleMatriculaAlumno = idDetalleMatriculaAlumno;
    }

    public Integer getIdGrado() {
        return this.idGrado;
    }

    public void setIdGrado(Integer idGrado) {
        this.idGrado = idGrado;
    }

    public Integer getIdAlumno() {
        return this.idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Integer getIdTurno() {
        return this.idTurno;
    }

    public void setIdTurno(Integer idTurno) {
        this.idTurno = idTurno;
    }

    public Integer getIdInstitucion() {
        return this.idInstitucion;
    }

    public void setIdInstitucion(Integer idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    public Integer getIdModalidad() {
        return this.idModalidad;
    }

    public void setIdModalidad(Integer idModalidad) {
        this.idModalidad = idModalidad;
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