/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portfolio.jandrade.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.jandrade.model.Tipo_empleo;
import portfolio.jandrade.repository.TipoEmpRepository;

/**
 *
 * @author yoni_
 */
@Service
public class TipoExpService implements ITipoExpService {
    
    @Autowired
    public TipoEmpRepository tipoExpRepo;
    
    @Override
    public List<Tipo_empleo> verTipoExp() {
      return tipoExpRepo.findAll();
    }

    @Override
    public void crearTipoExp(Tipo_empleo tipo) {
       tipoExpRepo.save(tipo);
    }

    @Override
    public void borrarTipoExp(Integer id) {
       tipoExpRepo.deleteById(id);
    }

    @Override
    public Tipo_empleo buscarTipoExp(Integer id) {
     return tipoExpRepo.findById(id).orElse(null);
    }
    
}
