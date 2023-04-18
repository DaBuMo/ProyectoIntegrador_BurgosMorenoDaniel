package com.miportfolio.daniel.Controller;

import com.miportfolio.daniel.Entity.Persona;
import com.miportfolio.daniel.Interface.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
class PersonaController 
{
    @Autowired PersonaService personaService;
    
    //Declaramos los metodos acontinuacion
    
    //De la base de datos al front
    @GetMapping("/personas/traer")
    public List<Persona> getPersona()
    {
        return personaService.getPersona();
    }
    @GetMapping("/personas/traer/perfil")
    public Persona findPersona()
    {
        return personaService.findPersona((long)1);
    }
    
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona)
    {
        personaService.savePersona(persona);
        return "persona creation completed";
    }
    
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id)
    {
        personaService.deletePersona(id);
        return "persona deleted";
    }
    
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona 
    (@PathVariable Long id, 
    @RequestParam("nombre") String newName, 
    @RequestParam("apellido") String newApellido,
    @RequestParam("img") String newImg)
    {
        Persona persona = personaService.findPersona(id);
        
        persona.setImg(newImg);
        persona.setApellido(newApellido);
        persona.setNombre(newName);
        
        personaService.savePersona(persona);
        return persona;
    }

}
