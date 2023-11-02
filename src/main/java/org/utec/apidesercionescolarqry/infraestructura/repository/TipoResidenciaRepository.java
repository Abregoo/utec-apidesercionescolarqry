package org.utec.apidesercionescolarqry.infraestructura.repository;

import java.util.List;

import org.utec.apidesercionescolarqry.model.TipoResidencia;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.control.ActivateRequestContext;
import jakarta.transaction.Transactional;

@ApplicationScoped
@ActivateRequestContext
@Transactional
public class TipoResidenciaRepository implements PanacheRepositoryBase<TipoResidencia, Integer> {
    
}
