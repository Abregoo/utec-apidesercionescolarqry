package org.utec.apidesercionescolarqry.infraestructura.repository;

import org.utec.apidesercionescolarqry.model.ConvivenciaFamiliar;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ConvivenciaFamiliarRepository implements PanacheRepositoryBase<ConvivenciaFamiliar, Integer>{
    
}
