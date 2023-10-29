package org.utec.apidesercionescolarqry.interfaces;

import java.util.*;

import org.utec.apidesercionescolarqry.aplicacion.InstitucionService;
import org.utec.apidesercionescolarqry.model.Institucion;

import jakarta.inject.Inject;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("institucion")
public class InstitucionResource {

    @Inject
    InstitucionService institucionService;

    @GET
    @Path("listados")
    public List<Institucion> listarInstitucion() {
        return institucionService.obtenerListadoInstitucion();
    }

    @GET
    @Path("id/{id}")
    public Response obtenerInstitucion(Integer id) {
        return Response.ok(institucionService.obtenerInstitucion(id)).build();
    }

    @POST
    public Response crearInstitucion(Institucion institucion) {
        institucionService.crearInstitucion(institucion);

        return Response.ok().build();
    }

    @PUT
    public Response modificarInstitucion(Institucion institucion) {
        institucionService.modificarInstitucion(institucion);
        return Response.ok().build();
    }

    @DELETE
    @Path("id/{id}")
    public Response desactivarInstitucion(Integer id) {
        institucionService.desactivar(id);
        return Response.ok().build();
    }

}
