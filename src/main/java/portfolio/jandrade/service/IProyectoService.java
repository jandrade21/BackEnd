/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package portfolio.jandrade.service;

import java.util.List;
import portfolio.jandrade.model.Proyecto;

/**
 *
 * @author yoni_
 */
public interface IProyectoService {
    
    public List<Proyecto> verProyecto();
    
    public void crearProyecto(Proyecto pro);
    
    public void borrarProyecto(Integer id);
    
    public Proyecto buscarProyecto(Integer id);
}
