/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package portfolio.jandrade.service;

import java.util.List;
import portfolio.jandrade.model.Experiencia;

/**
 *
 * @author yoni_
 */
public interface IExperienciaService {
    
    public List<Experiencia> verExperiencia();
    
    public void crearExperiencia(Experiencia exp);
    
    public void borrarExperiencia(Integer id);
    
    public Experiencia buscarExperiencia(Integer id);
}
