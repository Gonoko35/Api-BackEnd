
package com.MiPrimerApp.SpringBoot.servicio;

import com.MiPrimerApp.SpringBoot.modelo.Persona;
import java.util.List;


public interface IPersonaServicio {
    
    public List<Persona> verPersonas ();
    
    public void crearPersona (Persona per);
    
    public void borrarPersona (Long id);
    
    public Persona buscarPersona (Long id);
}
