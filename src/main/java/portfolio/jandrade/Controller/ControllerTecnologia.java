/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portfolio.jandrade.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import portfolio.jandrade.model.Tecnologia;
import portfolio.jandrade.service.ITecnologiaService;

/**
 *
 * @author yoni_
 */
@RestController
public class ControllerTecnologia {
    
    @Autowired
    private ITecnologiaService tecnoServ;
    
    @GetMapping ("/api/tecnologia")
    @ResponseBody
    public List<Tecnologia> verTecnologia(){
        return tecnoServ.verTecnologia();
    }
    
    @PostMapping("/api/tecnologia/new")
    public void agregarTecnologia (@RequestBody Tecnologia tecno){
        tecnoServ.crearTecnologia(tecno);
    }    
    
     @PutMapping("/api/tecnologia/edit")
     public void editarTecnologia(@RequestBody Tecnologia tecno) {
          tecnoServ.crearTecnologia(tecno);
          
   }
    @DeleteMapping("/api/tecnologia/delete/{id}")
    public void deletePersona (@PathVariable Integer id){
        tecnoServ.borrarTecnologia(id);
    }
}
