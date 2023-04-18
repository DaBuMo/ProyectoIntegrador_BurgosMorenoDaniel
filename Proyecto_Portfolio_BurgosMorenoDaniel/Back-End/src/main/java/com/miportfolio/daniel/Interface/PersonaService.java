
package com.miportfolio.daniel.Interface;

import com.miportfolio.daniel.Entity.Persona;
import java.util.List;

public interface PersonaService 
{
    // Get list Personas
    public List<Persona>getPersona();

    // Delete with ID
    public void deletePersona(Long id);
    
    // Search with ID
    public Persona findPersona(Long id); 
     
    // Save object persona
    public void savePersona(Persona persona);
}
