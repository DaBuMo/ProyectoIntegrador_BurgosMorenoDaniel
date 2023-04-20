package com.miportfolio.Seguridad.Servicio;

import com.miportfolio.Seguridad.Modelo.Rol;
import com.miportfolio.Seguridad.Modelo.UsuarioLogin;
import com.miportfolio.Seguridad.Repositorio.iUsuarioRepositorio;
import com.miportfolio.Seguridad.dto.UsuarioRegistroDto;
import java.util.Arrays;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicioImpl implements iUsuarioServicio {
    
    private iUsuarioRepositorio usuarioRepositorio;

    public UsuarioServicioImpl(iUsuarioRepositorio usuarioRepositorio) {
        super();
        this.usuarioRepositorio = usuarioRepositorio;
    }
    
    @Override
    public UsuarioLogin guardar(UsuarioRegistroDto registroDTO)
    {
        UsuarioLogin usuario = new UsuarioLogin(registroDTO.getNombre_login(),
        registroDTO.getApellido_login(),registroDTO.getEmail_login(),
        registroDTO.getPassword_login(),Arrays.asList(new Rol("ROLE_ADMIN")));
                return usuarioRepositorio.save(usuario);
    }
}
