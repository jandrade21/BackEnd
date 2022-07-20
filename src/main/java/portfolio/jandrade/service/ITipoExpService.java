/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package portfolio.jandrade.service;

import java.util.List;
import portfolio.jandrade.model.Tipo_empleo;

/**
 *
 * @author yoni_
 */
public interface ITipoExpService {
    
    public List<Tipo_empleo> verTipoExp();
    
    public void crearTipoExp(Tipo_empleo tipo);
    
    public void borrarTipoExp(Integer id);
    
    public Tipo_empleo buscarTipoExp(Integer id);
}
