package com.miportfolio.Interface;

import com.miportfolio.Entity.Persona;
import java.util.List;

public interface PersonaService 
{
    // Get list Personas
    public List <Persona> getPersona();
    
    // Save object persona
    public void savePersona(Persona persona);

    // Delete with ID
    public void deletePersona(Long id);
    
    // Search with ID
    public Persona findPersona(Long id); 
     

}
