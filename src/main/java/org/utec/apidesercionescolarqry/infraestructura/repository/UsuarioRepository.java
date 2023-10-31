package org.utec.apidesercionescolarqry.infraestructura.repository;

import org.utec.apidesercionescolarqry.model.Usuarios;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UsuarioRepository implements PanacheRepositoryBase<Usuarios, String>{
    

}
