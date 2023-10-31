package org.utec.apidesercionescolarqry.interfaces;

import org.utec.apidesercionescolarqry.aplicacion.LoginService;
import org.utec.apidesercionescolarqry.model.Usuarios;
import org.utec.apidesercionescolarqry.model.dto.PerfilDTO;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;


@Path("login")
public class LoginResource {

    @Inject
    LoginService loginService;

    @POST
    public PerfilDTO crearInstitucion(Usuarios usuarios) {
        return loginService.validarUsuario(usuarios);
    }

}
