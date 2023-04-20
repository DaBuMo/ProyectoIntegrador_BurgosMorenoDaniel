package com.miportfolio.Seguridad.Modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import java.util.Collection;

@Entity
@Table(name = "usuarios_login", uniqueConstraints = @UniqueConstraint(columnNames = "email_login"))
public class UsuarioLogin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_login;

    @Column(name = "nombre_login")
    private String nombre_login;

    @Column(name = "apellido_login")
    private String apellido_login;

    private String email_login;
    private String password_login;
    
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(
    name = "usuarios_roles",
            joinColumns = @JoinColumn (name = "usuario_login_id",referencedColumnName = "id_login"),
            inverseJoinColumns = @JoinColumn(name = "rol_id_login",referencedColumnName = "id_login")
    )
    private Collection<Rol> roles;

    public Long getId_login() {
        return id_login;
    }

    public void setId_login(Long id) {
        this.id_login = id;
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

    public Collection<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Rol> roles) {
        this.roles = roles;
    }

    public UsuarioLogin(Long id_login, String nombre_login, String apellido_login, String email_login, String password_login, Collection<Rol> roles) {
        this.id_login = id_login;
        this.nombre_login = nombre_login;
        this.apellido_login = apellido_login;
        this.email_login = email_login;
        this.password_login = password_login;
        this.roles = roles;
    }

    public UsuarioLogin(String nombre_login, String apellido_login, String email_login, String password_login, Collection<Rol> roles) {
        this.nombre_login = nombre_login;
        this.apellido_login = apellido_login;
        this.email_login = email_login;
        this.password_login = password_login;
        this.roles = roles;
    }

    public UsuarioLogin() {
    }

}
