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
import portfolio.jandrade.model.Tipo_edu;
import portfolio.jandrade.service.ITipoEduService;

/**
 *
 * @author yoni_
 */
@RestController

public class ControllerTipoEdu {
    
    @Autowired
    private ITipoEduService tipoeduServ;
    
    @GetMapping ("/api/educacion/tipo")
    @ResponseBody
    public List<Tipo_edu> verTipoEdu(){
        return tipoeduServ.verTipoEdu();
    }
    
    @GetMapping ("/api/educacion/tipo/{id}")
    @ResponseBody
    public Tipo_edu verTipoEdu(@PathVariable Integer id){
        return tipoeduServ.buscarTipoEdu(id);
    }
    
    @PostMapping("/api/educacion/tipo/new")
    public void agregarTipoEdu (@RequestBody Tipo_edu tipo){
        tipoeduServ.crearTipoEdu(tipo);
    }    
    
     @PutMapping("/api/educacion/tipo/edit")
     public void editarTipoEdu(@RequestBody Tipo_edu tipo) {
          tipoeduServ.crearTipoEdu(tipo);
          
   }
    @DeleteMapping("/api/educacion/tipo/delete/{id}")
    public void deleteTipoEdu (@PathVariable Integer id){
        tipoeduServ.borrarTipoEdu(id);
    }
}
