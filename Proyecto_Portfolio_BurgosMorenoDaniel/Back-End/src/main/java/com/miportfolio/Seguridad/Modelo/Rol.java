package com.miportfolio.Seguridad.Modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "rol_login")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre_login;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_login() {
        return nombre_login;
    }

    public void setNombre_login(String nombre_login) {
        this.nombre_login = nombre_login;
    }

    public Rol(Long id, String nombre_login) {
        this.id = id;
        this.nombre_login = nombre_login;
    }

    public Rol() {
    }

    public Rol(String nombre_login) {
        this.nombre_login = nombre_login;
    }
    
}
