/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package portfolio.jandrade.service;

import java.util.List;
import portfolio.jandrade.model.Persona;

/**
 *
 * @author yoni_
 */

public interface IPersonaService {
    
    public List<Persona> verPersonas();
    
    public void crearPersona(Persona per);
    
    public void borrarPersona(Integer id);
    
    public Persona buscarPersona(Integer id);
    
}
