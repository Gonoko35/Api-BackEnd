
package com.MiPrimerApp.SpringBoot.servicio;

import com.MiPrimerApp.SpringBoot.modelo.Persona;
import com.MiPrimerApp.SpringBoot.repositorio.PersonaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServicio implements IPersonaServicio {

    @Autowired
    public PersonaRepositorio persoBase;
    
    
    @Override
    public List<Persona> verPersonas() {
      return persoBase.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoBase.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
       persoBase.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
       return persoBase.findById(id).orElse(null);
    }
    
}
