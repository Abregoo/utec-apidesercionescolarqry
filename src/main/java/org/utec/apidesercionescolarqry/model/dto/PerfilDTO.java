package org.utec.apidesercionescolarqry.model.dto;

import java.util.List;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class PerfilDTO {

    public UsuarioDTO usuario;
    public List<MenuDTO> lstMenu;
    
}
