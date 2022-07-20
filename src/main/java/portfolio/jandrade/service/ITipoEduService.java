/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package portfolio.jandrade.service;

import java.util.List;
import portfolio.jandrade.model.Tipo_edu;

/**
 *
 * @author yoni_
 */
public interface ITipoEduService {
    
    public List<Tipo_edu> verTipoEdu();
    
    public void crearTipoEdu(Tipo_edu tipo);
    
    public void borrarTipoEdu(Integer id);
    
    public Tipo_edu buscarTipoEdu(Integer id);
    
}
