package br.com.setxpro.auth_user.domain.core.entities;

import br.com.setxpro.auth_user.domain.enums.RoleEnum;

import java.util.UUID;

public class Access {
    private UUID id;
    private String username;
    private String password;
    private RoleEnum role;

    public Access(UUID id, String username, String password, RoleEnum role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Access() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }
}
