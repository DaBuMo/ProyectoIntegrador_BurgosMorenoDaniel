
package com.miportfolio.Seguridad.Repositorio;

import com.miportfolio.Seguridad.Modelo.UsuarioLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iUsuarioRepositorio extends JpaRepository <UsuarioLogin, Long>{
    
}
