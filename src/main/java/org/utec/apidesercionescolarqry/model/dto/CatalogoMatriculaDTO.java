package org.utec.apidesercionescolarqry.model.dto;

import java.util.List;

import org.utec.apidesercionescolarqry.model.DependenciaEconomica;
import org.utec.apidesercionescolarqry.model.Nacionalidad;
import org.utec.apidesercionescolarqry.model.RecursosBasicos;
import org.utec.apidesercionescolarqry.model.Sexo;
import org.utec.apidesercionescolarqry.model.TipoResidencia;
import org.utec.apidesercionescolarqry.model.TipoVivienda;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class CatalogoMatriculaDTO {
    public List<TipoResidencia> lstresidencia;
    public List<TipoVivienda> lstvivienda;
    public List<Sexo> lstsexo;
    public List<Nacionalidad> lstnacionalidad;
    public List<RecursosBasicos> lstrecursosbasicos;
    public List<DependenciaEconomica> lstdependenciaeconomica;

    // public CatalogoMatriculaDTO() {
    // }

    // public CatalogoMatriculaDTO(List<TipoResidencia> lstresidencia, List<TipoVivienda> lstvivienda,
    //         List<Sexo> lstsexo, List<Nacionalidad> lstnacionalidad) {
    //     this.lstnacionalidad = lstnacionalidad;
    //     this.lstresidencia = lstresidencia;
    //     this.lstsexo = lstsexo;
    //     this.lstvivienda = lstvivienda;
    // }

}
