package org.utec.apidesercionescolarqry.interfaces;

import java.util.List;
import org.utec.apidesercionescolarqry.aplicacion.DetalleMatriculaAlumnoService;
import org.utec.apidesercionescolarqry.model.DetalleMatriculaAlumno;
import org.utec.apidesercionescolarqry.model.VwDetaMatriculaAlumno;
import org.utec.apidesercionescolarqry.model.dto.ResponseDTO;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("detallematricula")
public class DetalleMatriculaAlumnoResource {

    @Inject
    DetalleMatriculaAlumnoService detalleMatriculaAlumnoService;

    @GET
    @Path("listados")
    public List<VwDetaMatriculaAlumno> listarDetalleMatricula() {
        return detalleMatriculaAlumnoService.obtenerListadoDetalleMatricula();
    }

    @GET
    @Path("id/{id}")
    public Response obtenerDetalleMatricula(Integer id) {
        return Response.ok(detalleMatriculaAlumnoService.obtenerDetalleMatricula(id)).build();
    }

    @POST
    public Response crearDetalleMatricula(DetalleMatriculaAlumno detalleMatricula) {
        detalleMatriculaAlumnoService.crearDetalleMatricula(detalleMatricula);
        return Response.ok(new ResponseDTO()).build();
    }
  
}