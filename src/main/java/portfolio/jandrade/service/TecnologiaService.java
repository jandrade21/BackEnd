/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portfolio.jandrade.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.jandrade.model.Tecnologia;
import portfolio.jandrade.repository.TecnologiaRepository;

/**
 *
 * @author yoni_
 */
@Service
public class TecnologiaService implements ITecnologiaService{
    
    @Autowired
    public TecnologiaRepository tecnoRepo;

    @Override
    public List<Tecnologia> verTecnologia() {
       return tecnoRepo.findAll();
    }

    @Override
    public void crearTecnologia(Tecnologia tecno) {
       tecnoRepo.save(tecno);
    }

    @Override
    public void borrarTecnologia(Integer id) {
       tecnoRepo.deleteById(id);
    }

    @Override
    public Tecnologia buscarTecnologia(Integer id) {
      return tecnoRepo.findById(id).orElse(null);
    }
    
}
