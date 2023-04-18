package com.miportfolio.daniel.Repository;

import com.miportfolio.daniel.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepositorio extends JpaRepository<Persona,Long>
{
    
}
