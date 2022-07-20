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
import portfolio.jandrade.model.Educacion;
import portfolio.jandrade.service.IEducacionService;

/**
 *
 * @author yoni_
 */
@RestController
public class ControllerEducacion {
    

    
    @Autowired
    private IEducacionService eduServ;
    
    @GetMapping ("/api/educacion")
    @ResponseBody
    public List<Educacion> verEducacion(){
       return eduServ.verEducacion();
    }
    
    @PostMapping("/api/educacion/new")
    public void agregarEducacion (@RequestBody Educacion edu){
        eduServ.crearEducacion(edu);
    }    
    
     @PutMapping("/api/educacion/edit")
     public void editarPersona(@RequestBody Educacion edu) {
          eduServ.crearEducacion(edu);
          
   }
    @DeleteMapping("/api/educacion/delete/{id}")
    public void deleteEducacion (@PathVariable Integer id){
       eduServ.borrarEducacion(id);
    }
    
}
