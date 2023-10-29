package org.utec.apidesercionescolarqry.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Sexo implements Serializable {

    @Id
    private Integer idSexo;

    public Integer getIdSexo() {
        return this.idSexo;
    }

    public void setIdSexo(Integer idSexo) {
        this.idSexo = idSexo;
    }


}

