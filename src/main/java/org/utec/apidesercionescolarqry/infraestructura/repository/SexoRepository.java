package org.utec.apidesercionescolarqry.infraestructura.repository;

import java.util.List;
import org.utec.apidesercionescolarqry.model.Sexo;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SexoRepository implements PanacheRepositoryBase<Sexo, Integer> {

    public List<Sexo> listarCatalogoSexo(){
        return findAll().list();
    }
    
}
