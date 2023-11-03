package org.utec.apidesercionescolarqry.infraestructura.repository;

import org.utec.apidesercionescolarqry.model.Grado;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GradoRepository implements PanacheRepositoryBase<Grado, Integer>{    
}

