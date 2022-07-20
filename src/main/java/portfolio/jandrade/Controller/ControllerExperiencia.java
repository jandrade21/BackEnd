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
import portfolio.jandrade.model.Experiencia;
import portfolio.jandrade.service.IExperienciaService;

/**
 *
 * @author yoni_
 */
@RestController
public class ControllerExperiencia {
    
    @Autowired
    private IExperienciaService expServ;
    
    @GetMapping ("/api/experiencia")
    @ResponseBody
    public List<Experiencia> verExperiencia(){
       return expServ.verExperiencia();
    }
    
    @PostMapping("/api/experiencia/new")
    public void agregarExperiencia (@RequestBody Experiencia exp){
        expServ.crearExperiencia(exp);
    }    
    
     @PutMapping("/api/experiencia/edit")
     public void editarExperiencia(@RequestBody Experiencia exp) {
          expServ.crearExperiencia(exp);  
   }
     
    @DeleteMapping("/api/experiencia/delete/{id}")
    public void deleteExperiencia (@PathVariable Integer id){
       expServ.borrarExperiencia(id);
    }
}
