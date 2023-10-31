package org.utec.apidesercionescolarqry.aplicacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.utec.apidesercionescolarqry.infraestructura.repository.UsuarioRepository;
import org.utec.apidesercionescolarqry.infraestructura.repository.VWMenuxusuarioRepository;
import org.utec.apidesercionescolarqry.model.Usuarios;
import org.utec.apidesercionescolarqry.model.VWMenuxusuario;
import org.utec.apidesercionescolarqry.model.dto.MenuDTO;
import org.utec.apidesercionescolarqry.model.dto.PerfilDTO;
import org.utec.apidesercionescolarqry.model.dto.UsuarioDTO;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.BadRequestException;

@ApplicationScoped
public class LoginService {

    @Inject
    UsuarioRepository usuarioRepository;

    @Inject
    VWMenuxusuarioRepository menuxusuarioRepository;

    public PerfilDTO validarUsuario(Usuarios usuarios) {
        // buscar el usuario x username
        Usuarios userValid = usuarioRepository.findById(usuarios.getUsername());

        // Si el objeto es nulo retornar error
        if (Objects.isNull(userValid))
            throw new BadRequestException("El usuario no existe");

        // Si el username no coincide o la password retornar error
        if (!userValid.getUsername().equalsIgnoreCase(usuarios.getUsername()) ||
                !userValid.getPassword().equalsIgnoreCase(usuarios.getPassword()))
            throw new BadRequestException("Credenciales no válidas");

        // Si todo sale bien...

        // Armar Menu
        return armarMenu(userValid.getUsername());

        // Generar token

    }

    public PerfilDTO armarMenu(String usuario) {
        PerfilDTO perfilDTO = new PerfilDTO();
        List<VWMenuxusuario> lstMenuxusuarios = menuxusuarioRepository.buscarMenuxUsuario(usuario);

        if (Objects.isNull(lstMenuxusuarios) || lstMenuxusuarios.isEmpty())
            return perfilDTO;

        UsuarioDTO usuarioDTO = new UsuarioDTO();
        List<MenuDTO> lstmenu = new ArrayList<>();

        usuarioDTO.username = lstMenuxusuarios.get(0).getVwMenuxusuarioPK().getUsername();
        usuarioDTO.nombre = lstMenuxusuarios.get(0).getNombre();
        usuarioDTO.apellido = lstMenuxusuarios.get(0).getNombre();
        usuarioDTO.telefono = lstMenuxusuarios.get(0).getTelefono();

        lstMenuxusuarios.forEach(m -> {
            MenuDTO menuDTO = new MenuDTO();
            menuDTO.idmenu = m.getVwMenuxusuarioPK().getIdMenu();
            menuDTO.descripcion = m.getDescripcion();
            menuDTO.url = m.getUrl();
            lstmenu.add(menuDTO);
        });

        perfilDTO.usuario = usuarioDTO;
        perfilDTO.lstMenu = lstmenu;

        return perfilDTO;
    }

}
