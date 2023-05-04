
package com.MiPrimerApp.SpringBoot.repositorio;

import com.MiPrimerApp.SpringBoot.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepositorio extends JpaRepository <Persona,Long>{
    
}
