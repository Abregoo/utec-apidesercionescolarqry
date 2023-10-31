package org.utec.apidesercionescolarqry.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class VWMenuxusuarioPK {
    private String username;
    private Integer idMenu;

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getIdMenu() {
        return this.idMenu;
    }

    public void setIdMenu(Integer idMenu) {
        this.idMenu = idMenu;
    }

}
