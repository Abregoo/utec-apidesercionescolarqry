package org.utec.apidesercionescolarqry.infraestructura.repository;

import java.util.List;

import org.utec.apidesercionescolarqry.model.Alumno;
import org.utec.apidesercionescolarqry.model.DetalleMatriculaAlumno;
import org.utec.apidesercionescolarqry.model.VwDetaMatriculaAlumno;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class VwDetaMatriculaAlumnoRepository
        implements PanacheRepositoryBase<VwDetaMatriculaAlumno, Integer> {

    public List<VwDetaMatriculaAlumno> obtenerListadoDeta() {
        Integer estado = 1;
        return list("idEstadoMatricula =?1", estado);
    }

    public VwDetaMatriculaAlumno obtenerDeta(Integer id) {
        Integer estado = 1;
        return list("idEstadoMatricula =?1 and idDetalleMatriculaAlumno =?2", estado, id).stream().findFirst().orElse(null);
    }
}