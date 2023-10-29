package org.utec.apidesercionescolarqry.interfaces;

import io.quarkus.security.Authenticated;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.utec.apidesercionescolarqry.aplicacion.RecursosBasicosServices;
import org.utec.apidesercionescolarqry.aplicacion.SexoServices;
import org.utec.apidesercionescolarqry.model.RecursosBasicos;
import org.utec.apidesercionescolarqry.model.Sexo;

import java.util.List;

@Path("catalogo")
public class RecursosBasicosResource {

    @Inject
    RecursosBasicosServices recursosBasicosServices;

    @Inject
    SexoServices sexoServices;

    @GET
    @Path("resursobasico")
    @Authenticated
    public List<RecursosBasicos> listadoRecursosBasicos() {
        return recursosBasicosServices.obtenerCatalogoRecursosBasicos();
    }

    @GET
    @Path("sexo")
    @Authenticated
    public List<Sexo> listadoCatSexo() {
        return sexoServices.obtenerCatalogoSexo();
    }

}
