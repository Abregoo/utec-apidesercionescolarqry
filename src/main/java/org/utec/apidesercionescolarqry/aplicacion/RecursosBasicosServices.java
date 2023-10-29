package org.utec.apidesercionescolarqry.aplicacion;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.utec.apidesercionescolarqry.infraestructura.repository.RecursosBasicosRepository;
import org.utec.apidesercionescolarqry.model.RecursosBasicos;

import java.util.List;

@ApplicationScoped
public class RecursosBasicosServices {

    @Inject
    RecursosBasicosRepository recursosBasicosRepository;

    public List<RecursosBasicos> obtenerCatalogoRecursosBasicos() {

        return recursosBasicosRepository.listarRecursosBasicos();

    }
}
