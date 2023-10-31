package org.utec.apidesercionescolarqry.model;

import java.io.Serializable;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class VWMenuxusuario implements Serializable {

    @EmbeddedId
    private VWMenuxusuarioPK vwMenuxusuarioPK;
    private String nombre;
    private String apellido;
    private String telefono;
    private String descripcion;
    private String url;

    public VWMenuxusuarioPK getVwMenuxusuarioPK() {
        return this.vwMenuxusuarioPK;
    }

    public void setVwMenuxusuarioPK(VWMenuxusuarioPK vwMenuxusuarioPK) {
        this.vwMenuxusuarioPK = vwMenuxusuarioPK;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
