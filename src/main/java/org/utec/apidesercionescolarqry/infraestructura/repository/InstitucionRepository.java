package org.utec.apidesercionescolarqry.infraestructura.repository;

import java.util.*;

import org.utec.apidesercionescolarqry.model.Institucion;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class InstitucionRepository implements PanacheRepositoryBase<Institucion, Integer>{
    

    public List<Institucion> obtenerListadoInstitucion(){
        return findAll().list();
    }

}
