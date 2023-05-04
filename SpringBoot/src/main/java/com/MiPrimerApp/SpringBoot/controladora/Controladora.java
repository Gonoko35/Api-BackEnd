
package com.MiPrimerApp.SpringBoot.controladora;

import com.MiPrimerApp.SpringBoot.modelo.Persona;
import com.MiPrimerApp.SpringBoot.servicio.IPersonaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class Controladora {
    
    
    @Autowired
    private IPersonaServicio persoServi;
    
    @PostMapping ("nueva/persona")
    public void agregarPersona (@RequestBody Persona pers) {
         persoServi.crearPersona(pers);
    }
    
    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas() {
       return persoServi.verPersonas();
    } 
    
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona (@PathVariable Long id) {
       persoServi.borrarPersona(id);
    }
    
    
    
    
}
