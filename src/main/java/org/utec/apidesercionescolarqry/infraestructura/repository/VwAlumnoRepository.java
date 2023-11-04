package org.utec.apidesercionescolarqry.infraestructura.repository;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.panache.common.Page;
import io.quarkus.panache.common.Sort;
import org.utec.apidesercionescolarqry.model.VwAlumno;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class VwAlumnoRepository implements PanacheRepositoryBase<VwAlumno, Integer> {
    
    public List<VwAlumno> obtenerListadoAlumnos() {
        Boolean estado = false;

        Map<String, Object> param = new HashMap<>();
        param.put("estado", estado);

        StringBuilder query = new StringBuilder().append(" estado <>:estado");
        PanacheQuery<VwAlumno> vwQuery = find(query.toString(), Sort.descending("idAlumno"), param);

        return vwQuery.page(Page.of(0, 50)).list();


    }

    public VwAlumno obtenerAlumno(Integer id) {
        Boolean estado = false;
        return list("estado <>?1 and id =?2", estado,id).stream().findFirst().orElse(null);
    }
    
}
