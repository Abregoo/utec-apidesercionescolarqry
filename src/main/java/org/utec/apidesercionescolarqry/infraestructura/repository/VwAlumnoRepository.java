package org.utec.apidesercionescolarqry.infraestructura.repository;

import java.util.List;

import org.utec.apidesercionescolarqry.model.VwAlumno;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class VwAlumnoRepository implements PanacheRepositoryBase<VwAlumno, Integer> {
    
    public List<VwAlumno> obtenerListadoAlumnos() {
        Boolean estado = false;
        return list("estado <>?1", estado);
    }

    public VwAlumno obtenerAlumno(Integer id) {
        Boolean estado = false;
        return list("estado <>?1 and id =?2", estado,id).stream().findFirst().orElse(null);
    }
    
}
