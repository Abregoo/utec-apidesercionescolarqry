package org.utec.apidesercionescolarqry.aplicacion;


import org.utec.apidesercionescolarqry.infraestructura.repository.NacionalidadRepository;
import org.utec.apidesercionescolarqry.infraestructura.repository.SexoRepository;
import org.utec.apidesercionescolarqry.infraestructura.repository.TipoResidenciaRepository;
import org.utec.apidesercionescolarqry.infraestructura.repository.TipoViviendaRepository;
import org.utec.apidesercionescolarqry.model.dto.CatalogoMatriculaDTO;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CatalogosService {

        @Inject
        SexoRepository sexoRepository;

        @Inject
        NacionalidadRepository nacionalidadRepository;

        @Inject
        TipoViviendaRepository tipoViviendaRepository;

        @Inject
        TipoResidenciaRepository tipoResidenciaRepository;

        public CatalogoMatriculaDTO listarCatalogoMatricula() {
                CatalogoMatriculaDTO cat = new CatalogoMatriculaDTO();
                cat.lstnacionalidad = nacionalidadRepository.listAll();
                cat.lstresidencia = tipoResidenciaRepository.listAll();
                cat.lstsexo = sexoRepository.listAll();
                cat.lstvivienda = tipoViviendaRepository.listAll();
                return cat;
        }

}
