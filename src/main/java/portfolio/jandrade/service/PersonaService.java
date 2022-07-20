/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portfolio.jandrade.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.jandrade.model.Persona;
import portfolio.jandrade.repository.PersonaRepository;


/**
 *
 * @author yoni_
 */
@Service
public class PersonaService implements IPersonaService{

    @Autowired
    public PersonaRepository persoRepo;
    
    @Override
    public List<Persona> verPersonas() {
       return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Integer id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Integer id) {
        return persoRepo.findById(id).orElse(null);
    }
    

    
}
