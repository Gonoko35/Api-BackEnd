
package com.MiPrimerApp.SpringBoot.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String acercaDe;
    private String experiencia1;
    
    public Persona(){
        
    }
    public Persona(Long id, String nombre, String apellido, String acercaDe, String experiencia1){
       this.id=id;
       this.nombre=nombre;
       this.apellido= apellido;
       this.acercaDe= acercaDe;
       this.experiencia1=experiencia1;
    }
}