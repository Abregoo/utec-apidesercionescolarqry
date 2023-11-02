package org.utec.apidesercionescolarqry.infraestructura.repository;

import java.util.List;

import org.utec.apidesercionescolarqry.model.TipoVivienda;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TipoViviendaRepository implements PanacheRepositoryBase<TipoVivienda, Integer> {
    
   
}
