/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portfolio.jandrade.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.jandrade.model.Tipo_edu;
import portfolio.jandrade.repository.TipoEduRepository;



/**
 *
 * @author yoni_
 */
@Service
public class TipoEduService implements ITipoEduService{
    
    @Autowired
    public TipoEduRepository tipoeduRepo;

    @Override
    public List<Tipo_edu> verTipoEdu() {
       return tipoeduRepo.findAll();
    }

    @Override
    public void crearTipoEdu(Tipo_edu tipo) {
        tipoeduRepo.save(tipo);
    }

    @Override
    public void borrarTipoEdu(Integer id) {
       tipoeduRepo.deleteById(id);
    }

    @Override
    public  Tipo_edu buscarTipoEdu(Integer id) {
       return tipoeduRepo.findById(id).orElse(null);
    }

    
}
