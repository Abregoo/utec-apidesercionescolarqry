package org.utec.apidesercionescolarqry.aplicacion;

import org.utec.apidesercionescolarqry.infraestructura.repository.ConvivenciaFamiliarRepository;
import org.utec.apidesercionescolarqry.infraestructura.repository.DependenciaEconomicaRepository;
import org.utec.apidesercionescolarqry.infraestructura.repository.GradoRepository;
import org.utec.apidesercionescolarqry.infraestructura.repository.InstitucionRepository;
import org.utec.apidesercionescolarqry.infraestructura.repository.ModalidadRepository;
import org.utec.apidesercionescolarqry.infraestructura.repository.NacionalidadRepository;
import org.utec.apidesercionescolarqry.infraestructura.repository.RecursosBasicosRepository;
import org.utec.apidesercionescolarqry.infraestructura.repository.SexoRepository;
import org.utec.apidesercionescolarqry.infraestructura.repository.TipoResidenciaRepository;
import org.utec.apidesercionescolarqry.infraestructura.repository.TipoViviendaRepository;
import org.utec.apidesercionescolarqry.infraestructura.repository.TurnoRepository;
import org.utec.apidesercionescolarqry.model.Modalidad;
import org.utec.apidesercionescolarqry.model.dto.CatalogoMatriculaDTO;
import org.utec.apidesercionescolarqry.model.dto.CatalogodetaMatriculaDTO;

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

        @Inject
        ConvivenciaFamiliarRepository convivenciaFamiliarRepository;

        //
        @Inject
        GradoRepository gradoRepository;
        @Inject
        TurnoRepository turnoRepository;
        @Inject
        InstitucionRepository institucionRepository;
        @Inject
        ModalidadRepository modalidadRepository;

        public CatalogoMatriculaDTO listarCatalogoMatricula() {
                CatalogoMatriculaDTO cat = new CatalogoMatriculaDTO();
                cat.lstnacionalidad = nacionalidadRepository.listAll();
                cat.lstresidencia = tipoResidenciaRepository.listAll();
                cat.lstsexo = sexoRepository.listAll();
                cat.lstvivienda = tipoViviendaRepository.listAll();
                cat.lstdependenciaeconomica = dependenciaEconomicaRepository.listAll();
                cat.lstrecursosbasicos = recursosBasicosRepository.listAll();
                cat.lstconvivenciafamiliar = convivenciaFamiliarRepository.listAll();
                return cat;
        }

        public CatalogodetaMatriculaDTO listarCatalogoDetaMatricula() {
                CatalogodetaMatriculaDTO cat= new CatalogodetaMatriculaDTO();
                cat.lstgrado=gradoRepository.listAll();
                cat.lstturno = turnoRepository.listAll();
                cat.lstinstitucion = institucionRepository.listAll();
                cat.lstModalidad = modalidadRepository.listAll();
                return cat;
        }

}
