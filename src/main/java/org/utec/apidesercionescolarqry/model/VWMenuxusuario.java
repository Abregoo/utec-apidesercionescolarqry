package org.utec.apidesercionescolarqry.model;

import java.io.Serializable;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VWMenuxusuario that = (VWMenuxusuario) o;
        return Objects.equals(vwMenuxusuarioPK, that.vwMenuxusuarioPK) && Objects.equals(nombre, that.nombre) && Objects.equals(apellido, that.apellido) && Objects.equals(telefono, that.telefono) && Objects.equals(descripcion, that.descripcion) && Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vwMenuxusuarioPK, nombre, apellido, telefono, descripcion, url);
    }
}
