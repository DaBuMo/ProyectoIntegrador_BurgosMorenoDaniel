package com.miportfolio.Seguridad.Servicio;

import com.miportfolio.Seguridad.Modelo.UsuarioLogin;
import com.miportfolio.Seguridad.dto.UsuarioRegistroDto;

public interface iUsuarioServicio {
    public UsuarioLogin guardar(UsuarioRegistroDto registroDTO);
}
