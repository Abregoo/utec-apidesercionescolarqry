package org.utec.apidesercionescolarqry.infraestructura.repository;

import org.utec.apidesercionescolarqry.model.Turno;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TurnoRepository implements PanacheRepositoryBase<Turno, Integer>{
    
}
