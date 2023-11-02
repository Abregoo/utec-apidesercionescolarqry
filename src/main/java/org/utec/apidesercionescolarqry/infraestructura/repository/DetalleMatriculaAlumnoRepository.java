package org.utec.apidesercionescolarqry.infraestructura.repository;

import java.util.List;
import org.utec.apidesercionescolarqry.model.DetalleMatriculaAlumno;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DetalleMatriculaAlumnoRepository
        implements PanacheRepositoryBase<DetalleMatriculaAlumno, Integer> {


}