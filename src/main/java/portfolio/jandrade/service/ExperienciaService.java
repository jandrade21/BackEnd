/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portfolio.jandrade.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.jandrade.model.Experiencia;
import portfolio.jandrade.repository.ExperienciaRepository;

/**
 *
 * @author yoni_
 */
@Service
public class ExperienciaService implements IExperienciaService {
    
    @Autowired
    public ExperienciaRepository expRepo;

    @Override
    public List<Experiencia> verExperiencia() {
       return expRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Integer id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Integer id) {
        return expRepo.findById(id).orElse(null);
    }
    
}
