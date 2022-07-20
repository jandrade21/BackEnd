/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package portfolio.jandrade.service;

import java.util.List;
import portfolio.jandrade.model.Tecnologia;

/**
 *
 * @author yoni_
 */
public interface ITecnologiaService {
        
    public List<Tecnologia> verTecnologia();
    
    public void crearTecnologia(Tecnologia tecno);
    
    public void borrarTecnologia(Integer id);
    
    public Tecnologia buscarTecnologia(Integer id);
}
