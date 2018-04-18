package com.example.hp.myappmascotas.resApi.model;

public class UsuarioResponse {
    private String usuario;
    private String token;

    public UsuarioResponse(String usuario, String token) {
        this.usuario = usuario;
        this.token = token;
    }

    public UsuarioResponse() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
