package org.utec.apidesercionescolarqry.aplicacion;


import org.utec.apidesercionescolarqry.infraestructura.repository.DependenciaEconomicaRepository;
import org.utec.apidesercionescolarqry.infraestructura.repository.NacionalidadRepository;
import org.utec.apidesercionescolarqry.infraestructura.repository.RecursosBasicosRepository;
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

        @Inject
        DependenciaEconomicaRepository dependenciaEconomicaRepository;

        @Inject
        RecursosBasicosRepository recursosBasicosRepository;

        public CatalogoMatriculaDTO listarCatalogoMatricula() {
                CatalogoMatriculaDTO cat = new CatalogoMatriculaDTO();
                cat.lstnacionalidad = nacionalidadRepository.listAll();
                cat.lstresidencia = tipoResidenciaRepository.listAll();
                cat.lstsexo = sexoRepository.listAll();
                cat.lstvivienda = tipoViviendaRepository.listAll();
                cat.lstdependenciaeconomica=dependenciaEconomicaRepository.listAll();
                cat.lstrecursosbasicos = recursosBasicosRepository.listAll();
                return cat;
        }

}
