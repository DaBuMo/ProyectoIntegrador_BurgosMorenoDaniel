package com.miportfolio.Seguridad.Controlador;

import com.miportfolio.Seguridad.Servicio.iUsuarioServicio;
import com.miportfolio.Seguridad.dto.UsuarioRegistroDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registro")
public class RegistroUsuarioControlador {

    private iUsuarioServicio usuarioServicio;

    public RegistroUsuarioControlador(iUsuarioServicio usuarioServicio) {
        super();
        this.usuarioServicio = usuarioServicio;
    }

    @ModelAttribute("usuario_login")
    public UsuarioRegistroDto retornarNuevoUsuarioRegristroDto() {
        return new UsuarioRegistroDto();
    }

    @GetMapping
    public String mostrarFormularioDeRegistro() {
        return "registro";
    }

    @PostMapping
    public String registrarCuentaDeUsuario(@ModelAttribute("usuario_login") UsuarioRegistroDto registroDTO) {
        usuarioServicio.guardar(registroDTO);
        return "redirect:/registro?exito";
    }
}
