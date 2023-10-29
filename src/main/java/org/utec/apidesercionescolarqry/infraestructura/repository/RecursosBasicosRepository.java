package org.utec.apidesercionescolarqry.infraestructura.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import org.utec.apidesercionescolarqry.model.RecursosBasicos;

import java.util.List;

@ApplicationScoped
public class RecursosBasicosRepository implements PanacheRepositoryBase<RecursosBasicos, Integer> {

    public List<RecursosBasicos> listarRecursosBasicos(){
        return findAll().list();
    }

}
