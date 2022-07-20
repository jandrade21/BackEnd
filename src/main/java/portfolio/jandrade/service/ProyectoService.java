/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portfolio.jandrade.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.jandrade.model.Proyecto;
import portfolio.jandrade.repository.ProyectoRepository;

/**
 *
 * @author yoni_
 */
@Service
public class ProyectoService implements IProyectoService {
    
    @Autowired
    public ProyectoRepository proyecRepo;

    @Override
    public List<Proyecto> verProyecto() {
        return proyecRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto pro) {
       proyecRepo.save(pro);
    }

    @Override
    public void borrarProyecto(Integer id) {
       proyecRepo.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(Integer id) {
       return proyecRepo.findById(id).orElse(null);
    }
    
}
