package org.utec.apidesercionescolarqry.infraestructura.repository;

import org.utec.apidesercionescolarqry.model.Modalidad;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ModalidadRepository implements PanacheRepositoryBase<Modalidad, Integer>{
    
}