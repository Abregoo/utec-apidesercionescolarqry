package org.utec.apidesercionescolarqry.aplicacion;

import java.util.List;
import java.util.Objects;

import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.ws.rs.InternalServerErrorException;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;
import org.utec.apidesercionescolarqry.infraestructura.repository.AlumnoRepository;
import org.utec.apidesercionescolarqry.infraestructura.repository.VwAlumnoRepository;
import org.utec.apidesercionescolarqry.interfaces.restclient.ApiAlgoritmoRestClient;
import org.utec.apidesercionescolarqry.model.Alumno;
import org.utec.apidesercionescolarqry.model.VwAlumno;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.BadRequestException;
import org.utec.apidesercionescolarqry.model.dto.AlumnoDTO;
import org.utec.apidesercionescolarqry.model.dto.PrediccionDTO;

@ApplicationScoped
public class AlumnoService {

    private static final Logger LOGGER = Logger.getLogger(AlumnoService.class);


    @Inject
    AlumnoRepository alumnoRepository;

    @Inject
    VwAlumnoRepository vwAlumnoRepository;

    @Inject
    @RestClient
    ApiAlgoritmoRestClient apiAlgoritmoRestClient;

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


    public PrediccionDTO algorimo(Alumno alumno) {
        System.out.println("LLegandoo para consulta de algoritmo");

        try {
            String json = imprimirJSON(alumno);
            PrediccionDTO dto = apiAlgoritmoRestClient.obtenerPredicion(json);
            System.out.println("OBTENIENDO VALOR: " + dto.probability);
            return dto;
        } catch (Exception e) {
            System.out.println("FALLOOOOOOOO" + e);
            throw new BadRequestException("FALLOOO");
        }

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

    public static <T> String imprimirJSON(T clase) {

        try (Jsonb jsonb = JsonbBuilder.create()) {
            String json = jsonb.toJson(clase);
            LOGGER.info(json);

            return json;

        } catch (Exception e) {
            throw new InternalServerErrorException("Error al armar ej json");
        }
    }

}
