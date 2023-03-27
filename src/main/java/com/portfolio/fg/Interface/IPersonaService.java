
package com.portfolio.fg.Interface;

import com.portfolio.fg.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer persona
    public List<Persona> getPersona();
    
    //guardar un object de tipo persona
    public void savePersona(Persona persona);
    
    //eliminar un object por id
    public void deletePersona(Long id);
    
    //buscar persona por id
    public Persona findPersona(Long id);
    
    
}
