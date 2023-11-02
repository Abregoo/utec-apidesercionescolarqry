package org.utec.apidesercionescolarqry.interfaces;

import java.util.List;

import org.utec.apidesercionescolarqry.aplicacion.AlumnoService;
import org.utec.apidesercionescolarqry.model.Alumno;

import jakarta.inject.Inject;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;

@Path("alumno")
public class AlumnoResource {

    @Inject
    AlumnoService alumnoService;

    @GET
    @Path("listados")
    public List<Alumno> listarAlumnos() {
        return alumnoService.obtenerListadoAlumnos();
    }

    @GET
    @Path("id/{id}")
    public Response obtenerAlumno(Integer id) {
        return Response.ok(alumnoService.obtenerAlumno(id)).build();
    }

    @POST
    public Response crearAlumno(Alumno alumno) {
        alumnoService.crearAlumno(alumno);
        return Response.ok().build();
    }

    @PUT
    public Response modificarAlumno(Alumno alumno) {
        alumnoService.modificarAlumno(alumno);
        return Response.ok().build();
    }

    @DELETE
    @Path("id/{id}")
    public Response desactivarAlumno(Integer id) {
        alumnoService.desactivarAlumno(id);
        return Response.ok().build();
    }
}