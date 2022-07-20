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
import portfolio.jandrade.model.Proyecto;
import portfolio.jandrade.service.IProyectoService;

/**
 *
 * @author yoni_
 */
@RestController
public class ControllerProyecto {
    
    @Autowired
    private IProyectoService proyecServ;
    
    @GetMapping ("/api/proyecto")
    @ResponseBody
    public List<Proyecto> verProyecto(){
        return proyecServ.verProyecto();
    }
    
    @PostMapping("/api/proyecto/new")
    public void agregarProyecto (@RequestBody Proyecto pro){
        proyecServ.crearProyecto(pro);
    }    
    
     @PutMapping("/api/proyecto/edit")
     public void editarProyecto(@RequestBody Proyecto pro) {
          proyecServ.crearProyecto(pro);
          
   }
    @DeleteMapping("/api/proyecto/delete/{id}")
    public void deleteProyecto (@PathVariable Integer id){
        proyecServ.borrarProyecto(id);
    }
}
