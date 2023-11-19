package org.utec.apidesercionescolarqry.aplicacion;

import java.math.RoundingMode;
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
import org.utec.apidesercionescolarqry.model.dto.ResponseDTO;

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

    public ResponseDTO procesarAlumno(Alumno alumno) {
        PrediccionDTO dto = algoritmoPrediccion(alumno);
        if (Objects.isNull(dto))
            throw new BadRequestException("El objeto probabilistico es nulo");
        alumno.setProbabilidad(dto.probability.setScale(2, RoundingMode.HALF_UP));
        alumno.setEstado(true);
        crearAlumno(alumno);

        ResponseDTO dtoResponse = new ResponseDTO();
        dtoResponse.probabilidad = alumno.getProbabilidad();
        return dtoResponse;
        
    }

    @Transactional
    public void crearAlumno(Alumno alumno) {
        alumnoRepository.persist(alumno);
    }

    public PrediccionDTO algoritmoPrediccion(Alumno alumno) {
        LOGGER.info("Procesando Algoritmo...");
        try {
            AlumnoDTO alumnoDTO = armarAlumnoDTO(alumno);
            String json = imprimirJSON(alumnoDTO);
            PrediccionDTO dto = apiAlgoritmoRestClient.obtenerPredicion(json);
            LOGGER.info("Recibiendo respuesta Algoritmo...");
            return dto;
        } catch (Exception e) {
            LOGGER.error("Fallo la peticion de consulta al algoritmo");
            throw new BadRequestException("FALLOOO");
        }

    }

    public AlumnoDTO armarAlumnoDTO(Alumno alumno) {
        AlumnoDTO dto = new AlumnoDTO();
        dto.cantidadHermanos = alumno.getCantidadHermanos();
        dto.idConvivenciaFamiliar = alumno.getIdConvivenciaFamiliar();
        dto.idDependenciaEconomica = alumno.getIdDependenciaEconomica();
        dto.idSexo = alumno.getIdSexo();
        dto.idNacionalidad = alumno.getIdNacionalidad();
        dto.idRecursoBasico = alumno.getIdRecursoBasico();
        dto.idTipoResidencia = alumno.getIdTipoResidencia();
        dto.idTipoVivienda = alumno.getIdTipoVivienda();

        return dto;
    }

    @Transactional
    public ResponseDTO modificarAlumno(Alumno alumno) {
        Alumno alumnoModificar = alumnoRepository.obtenerAlumno(alumno.getIdAlumno());
        if (Objects.isNull(alumnoModificar))
            throw new BadRequestException("El alumno no fue encontrado");

        PrediccionDTO dto = algoritmoPrediccion(alumno);
        if (Objects.isNull(dto))
            throw new BadRequestException("El objeto probabilistico es nulo");

        alumnoModificar.setProbabilidad(dto.probability.setScale(2, RoundingMode.HALF_UP));
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

        ResponseDTO dtoResponse = new ResponseDTO();
        dtoResponse.probabilidad = alumno.getProbabilidad();
        return dtoResponse;
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
