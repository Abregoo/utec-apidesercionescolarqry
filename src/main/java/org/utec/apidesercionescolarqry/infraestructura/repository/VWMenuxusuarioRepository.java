package org.utec.apidesercionescolarqry.infraestructura.repository;

import java.util.List;

import org.utec.apidesercionescolarqry.model.VWMenuxusuario;
import org.utec.apidesercionescolarqry.model.VWMenuxusuarioPK;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class VWMenuxusuarioRepository implements PanacheRepositoryBase<VWMenuxusuario, VWMenuxusuarioPK>{
    
    public List<VWMenuxusuario> buscarMenuxUsuario(String usuario){
        return list("vwMenuxusuarioPK.username=?1", usuario);
    }
}
