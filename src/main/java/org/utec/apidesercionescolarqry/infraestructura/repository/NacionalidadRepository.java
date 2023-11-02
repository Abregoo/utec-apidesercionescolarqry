package org.utec.apidesercionescolarqry.infraestructura.repository;

import java.util.List;

import org.utec.apidesercionescolarqry.model.Nacionalidad;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NacionalidadRepository implements PanacheRepositoryBase<Nacionalidad, Integer> {
   
}
