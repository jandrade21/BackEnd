/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package portfolio.jandrade.service;

import java.util.List;
import portfolio.jandrade.model.Educacion;

/**
 *
 * @author yoni_
 */
public interface IEducacionService {
        
    public List<Educacion> verEducacion();
    
    public void crearEducacion(Educacion edu);
    
    public void borrarEducacion(Integer id);
    
    public Educacion buscarEducacion(Integer id);
    
}
