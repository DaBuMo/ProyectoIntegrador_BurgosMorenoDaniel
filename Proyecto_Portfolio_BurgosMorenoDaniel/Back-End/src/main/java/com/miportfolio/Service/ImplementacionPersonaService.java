package com.miportfolio.Service;


import com.miportfolio.Entity.Persona;
import com.miportfolio.Interface.PersonaService;
import com.miportfolio.Repository.PersonaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplementacionPersonaService implements PersonaService
{
    //AutoWire
    @Autowired PersonaRepositorio personaRepositorio;
    
    @Override
    public List<Persona> getPersona() 
    {
        List<Persona> persona = personaRepositorio.findAll();
        return persona;
    }

    @Override
    public void deletePersona(Long id) 
    {
        personaRepositorio.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) 
    {
        Persona persona = personaRepositorio.findById(id).orElse(null);
        return persona;
    }

    @Override
    public void savePersona(Persona persona) 
    {
        personaRepositorio.save(persona);
    }
    
}
