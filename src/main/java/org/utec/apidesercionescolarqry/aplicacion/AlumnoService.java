package org.utec.apidesercionescolarqry.aplicacion;

import java.util.List;
import java.util.Objects;

import org.utec.apidesercionescolarqry.infraestructura.repository.AlumnoRepository;
import org.utec.apidesercionescolarqry.infraestructura.repository.VwAlumnoRepository;
import org.utec.apidesercionescolarqry.model.Alumno;
import org.utec.apidesercionescolarqry.model.VwAlumno;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.BadRequestException;

@ApplicationScoped
public class AlumnoService {

    @Inject
    AlumnoRepository alumnoRepository;

    @Inject
    VwAlumnoRepository vwAlumnoRepository;

    public List<VwAlumno> obtenerListadoAlumnos() {
        return vwAlumnoRepository.obtenerListadoAlumnos();
    }

    public VwAlumno obtenerAlumno(Integer id) {
        return vwAlumnoRepository.obtenerAlumno(id);
    }

    @Transactional
    public void crearAlumno(Alumno alumno) {
        alumnoRepository.persist(alumno);
    }

    @Transactional
    public void modificarAlumno(Alumno alumno) {
        Alumno alumnoModificar = alumnoRepository.obtenerAlumno(alumno.getIdAlumno());

        if (Objects.isNull(alumnoModificar)) {
            throw new BadRequestException("El alumno no fue encontrado");
        }

        alumnoModificar.setIdDependenciaEconomica(alumno.getIdDependenciaEconomica());
        alumnoModificar.setIdTipoResidencia(alumno.getIdTipoResidencia());
        alumnoModificar.setIdConvivenciaFamiliar(alumno.getIdConvivenciaFamiliar());
        alumnoModificar.setIdRecursoBasico(alumno.getIdRecursoBasico());
        alumnoModificar.setIdTipoVivienda(alumno.getIdTipoVivienda());
        alumnoModificar.setIdNacionalidad(alumno.getIdNacionalidad());
        alumnoModificar.setIdSexo(alumno.getIdSexo());
        alumnoModificar.setDireccionResidencia(alumno.getDireccionResidencia());
        alumnoModificar.setCantidadHermanos(alumno.getCantidadHermanos());
        alumnoModificar.setAnioNacimiento(alumno.getAnioNacimiento());
        alumnoModificar.setEstado(alumno.getEstado());
    }

    @Transactional
    public void desactivarAlumno(Integer id) {
        Alumno alumnoDesactivar = alumnoRepository.obtenerAlumno(id);

        if (Objects.isNull(alumnoDesactivar))
            throw new BadRequestException("El alumno no fue encontrado");

        alumnoDesactivar.setEstado(false);
    }

}
