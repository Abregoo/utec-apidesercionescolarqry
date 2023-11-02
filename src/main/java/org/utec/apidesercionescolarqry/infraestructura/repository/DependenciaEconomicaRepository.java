package org.utec.apidesercionescolarqry.infraestructura.repository;

import org.utec.apidesercionescolarqry.model.DependenciaEconomica;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DependenciaEconomicaRepository implements PanacheRepositoryBase<DependenciaEconomica, Integer> {
    
    
}
