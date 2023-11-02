package org.utec.apidesercionescolarqry.aplicacion;

import java.util.List;
import java.util.Objects;
import org.utec.apidesercionescolarqry.infraestructura.repository.DetalleMatriculaAlumnoRepository;
import org.utec.apidesercionescolarqry.model.DetalleMatriculaAlumno;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.BadRequestException;
import jakarta.ws.rs.Path;
import java.time.LocalDateTime;
import java.time.LocalDate;

@ApplicationScoped
public class DetalleMatriculaAlumnoService {

    @Inject
    DetalleMatriculaAlumnoRepository detalleMatriculaAlumnoRepository;

    public List<DetalleMatriculaAlumno> obtenerListadoDetalleMatricula() {
        return detalleMatriculaAlumnoRepository.obtenerListadoDetalleMatricula();
    }

    @Transactional
    public void crearDetalleMatricula(DetalleMatriculaAlumno detalleMatricula) {
        detalleMatricula.setAnioLectivo(LocalDate.now());
        detalleMatricula.setFechaMatricula(LocalDateTime.now());
        detalleMatriculaAlumnoRepository.persist(detalleMatricula);
        System.out.println(detalleMatricula.getAnioLectivo());
    }

    @Transactional
    public void modificarDetalleMatricula(DetalleMatriculaAlumno detalleMatricula) {
        DetalleMatriculaAlumno detalleModificado = detalleMatriculaAlumnoRepository.findById(detalleMatricula.getIdDetalleMatriculaAlumno());

        if (Objects.isNull(detalleModificado))
            throw new BadRequestException("El detalle de matrícula no fue encontrado");

        detalleModificado.setIdDetalleMatriculaAlumno(detalleMatricula.getIdDetalleMatriculaAlumno());
        detalleModificado.setIdGrado(detalleMatricula.getIdGrado());
        detalleModificado.setIdAlumno(detalleMatricula.getIdAlumno());
        detalleModificado.setIdTurno(detalleMatricula.getIdTurno());
        detalleModificado.setIdInstitucion(detalleMatricula.getIdInstitucion());
        detalleModificado.setIdModalidad(detalleMatricula.getIdModalidad());
        detalleModificado.setIdEstadoMatricula(detalleMatricula.getIdEstadoMatricula());
        detalleModificado.setAnioLectivo(detalleMatricula.getAnioLectivo());
        detalleModificado.setFechaMatricula(detalleMatricula.getFechaMatricula());
    }

    @Transactional
    public void desactivarDetalleMatricula(Integer id) {
        DetalleMatriculaAlumno detalleDesactivar = detalleMatriculaAlumnoRepository.findById(id);

        if (Objects.isNull(detalleDesactivar))
            throw new BadRequestException("El detalle de matrícula no fue encontrado");

        detalleDesactivar.setIdEstadoMatricula(0); // Cambiar el estado de matrícula según tu lógica
    }

    public DetalleMatriculaAlumno obtenerDetalleMatricula(Integer id) {
        return detalleMatriculaAlumnoRepository.findById(id);
    }
}
