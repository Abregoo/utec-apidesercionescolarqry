package org.utec.apidesercionescolarqry.model.dto;

import java.util.List;

import org.utec.apidesercionescolarqry.model.ConvivenciaFamiliar;
import org.utec.apidesercionescolarqry.model.DependenciaEconomica;
import org.utec.apidesercionescolarqry.model.Grado;
import org.utec.apidesercionescolarqry.model.Institucion;
import org.utec.apidesercionescolarqry.model.Modalidad;
import org.utec.apidesercionescolarqry.model.Nacionalidad;
import org.utec.apidesercionescolarqry.model.RecursosBasicos;
import org.utec.apidesercionescolarqry.model.Sexo;
import org.utec.apidesercionescolarqry.model.TipoResidencia;
import org.utec.apidesercionescolarqry.model.TipoVivienda;
import org.utec.apidesercionescolarqry.model.Turno;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class CatalogodetaMatriculaDTO {    
    public List<Grado> lstgrado;
    public List<Turno> lstturno;
    public List<Institucion> lstinstitucion;
    public List<Modalidad> lstModalidad;
    
}
