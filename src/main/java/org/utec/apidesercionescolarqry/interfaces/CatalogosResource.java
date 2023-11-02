package org.utec.apidesercionescolarqry.interfaces;

import org.utec.apidesercionescolarqry.aplicacion.CatalogosService;
import org.utec.apidesercionescolarqry.model.dto.CatalogoMatriculaDTO;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("catalogos")
public class CatalogosResource {

    @Inject
    CatalogosService catalogosService;

    @GET
    @Path("/matricula")
    public CatalogoMatriculaDTO obtenerCatalogos() {

        return catalogosService.listarCatalogoMatricula();
    }

}
