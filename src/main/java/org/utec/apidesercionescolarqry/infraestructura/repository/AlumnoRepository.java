package org.utec.apidesercionescolarqry.infraestructura.repository;

import java.math.BigDecimal;
import java.util.List;

import org.utec.apidesercionescolarqry.model.Alumno;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AlumnoRepository implements PanacheRepositoryBase<Alumno, Integer> {
    
    public List<Alumno> obtenerListadoAlumnos() {
        Boolean estado = false;
        return list("estado <>?1", estado);
    }

    public Alumno obtenerAlumno(Integer id) {
        Boolean estado = false;
        return list("estado <>?1 and id =?2", estado,id).stream().findFirst().orElse(null);
    }


    public List<Alumno> obtenerAlumnosMayor50() {
        Boolean estado = false;
        BigDecimal probabilidad = new BigDecimal("0.50");
        return list("estado <>?1 and probabilidad >?2", estado,probabilidad);
    }


}
