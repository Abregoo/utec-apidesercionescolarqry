package org.utec.apidesercionescolarqry.aplicacion;

import java.util.List;
import java.util.Objects;

import org.utec.apidesercionescolarqry.infraestructura.repository.InstitucionRepository;
import org.utec.apidesercionescolarqry.model.Institucion;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.BadRequestException;
import jakarta.ws.rs.Path;

@ApplicationScoped
public class InstitucionService {

    @Inject
    InstitucionRepository institucionRepository;


    public List<Institucion> obtenerListadoInstitucion(){
        return institucionRepository.obtenerListadoInstitucion();
    }
    

    @Transactional
    public void crearInstitucion(Institucion institucion){
        institucionRepository.persist(institucion);
    }


    @Transactional
    public void modificarInstitucion(Institucion institucion){
        Institucion instimodificar = institucionRepository.findById(institucion.getIdInstitucion());

        if(Objects.isNull(instimodificar)) 
        throw new BadRequestException("La insticucion no fue encontrada");
        
        instimodificar.setIdInstitucion(institucion.getIdInstitucion());
        instimodificar.setCodigoInstitucion(institucion.getCodigoInstitucion());
        instimodificar.setDireccion(institucion.getDireccion());
        instimodificar.setNombreInstitucion(institucion.getNombreInstitucion());


    }


    @Transactional
    public void desactivar(Integer id){
        Institucion institucionDesactivar = institucionRepository.findById(id);

     if(Objects.isNull(institucionDesactivar)) 
        throw new BadRequestException("La insticucion no fue encontrada");
        institucionDesactivar.setEstado(false);
    }



    public Institucion obtenerInstitucion(Integer id){
        
        
        return  institucionRepository.findById(id);
        

    }


    
}
