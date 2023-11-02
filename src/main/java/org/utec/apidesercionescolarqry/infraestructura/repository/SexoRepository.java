package org.utec.apidesercionescolarqry.infraestructura.repository;

import org.utec.apidesercionescolarqry.model.Sexo;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.control.ActivateRequestContext;
import jakarta.transaction.Transactional;

@ApplicationScoped
@ActivateRequestContext
@Transactional
public class SexoRepository implements PanacheRepositoryBase<Sexo, Integer> {
    
}
