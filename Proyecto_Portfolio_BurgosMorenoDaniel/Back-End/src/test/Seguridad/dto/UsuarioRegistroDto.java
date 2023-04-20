package com.miportfolio.Seguridad.dto;

public class UsuarioRegistroDto {

    private Long id_login;
    private String nombre_login;
    private String apellido_login;
    private String email_login;
    private String password_login;

    public Long getId_login() {
        return id_login;
    }

    public void setId_login(Long id_login) {
        this.id_login = id_login;
    }

    public String getNombre_login() {
        return nombre_login;
    }

    public void setNombre_login(String nombre_login) {
        this.nombre_login = nombre_login;
    }

    public String getApellido_login() {
        return apellido_login;
    }

    public void setApellido_login(String apellido_login) {
        this.apellido_login = apellido_login;
    }

    public String getEmail_login() {
        return email_login;
    }

    public void setEmail_login(String email_login) {
        this.email_login = email_login;
    }

    public String getPassword_login() {
        return password_login;
    }

    public void setPassword_login(String password_login) {
        this.password_login = password_login;
    }

    public UsuarioRegistroDto(Long id_login, String nombre_login, String apellido_login, String email_login, String password_login) {
        this.id_login = id_login;
        this.nombre_login = nombre_login;
        this.apellido_login = apellido_login;
        this.email_login = email_login;
        this.password_login = password_login;
    }

    public UsuarioRegistroDto(String nombre_login, String apellido_login, String email_login, String password_login) {
        this.nombre_login = nombre_login;
        this.apellido_login = apellido_login;
        this.email_login = email_login;
        this.password_login = password_login;
    }

    public UsuarioRegistroDto(String email_login) {
        this.email_login = email_login;
    }

    public UsuarioRegistroDto() {
    }

}
