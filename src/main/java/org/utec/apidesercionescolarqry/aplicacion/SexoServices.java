package org.utec.apidesercionescolarqry.aplicacion;

import java.util.List;

import org.utec.apidesercionescolarqry.infraestructura.repository.SexoRepository;
import org.utec.apidesercionescolarqry.model.Sexo;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class SexoServices {
    
    @Inject
    SexoRepository sexoRepository;

    public List<Sexo> obtenerCatalogoSexo(){
        return sexoRepository.listAll();
    }

}
