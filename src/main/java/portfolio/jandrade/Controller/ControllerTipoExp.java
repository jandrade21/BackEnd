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
import portfolio.jandrade.model.Tipo_empleo;
import portfolio.jandrade.service.ITipoExpService;

/**
 *
 * @author yoni_
 */
@RestController
public class ControllerTipoExp {
    
    @Autowired
    private ITipoExpService tipoExpServ;
    
    @GetMapping ("/api/experiencia/tipo")
    @ResponseBody
    public List<Tipo_empleo> verTipoExp(){
        return tipoExpServ.verTipoExp();
    }
    
    @GetMapping ("/api/experiencia/tipo/{id}")
    @ResponseBody
    public Tipo_empleo verTipoExp(@PathVariable Integer id){
        return tipoExpServ.buscarTipoExp(id);
    }
    
    @PostMapping("/api/experiencia/tipo/new")
    public void agregarTipoEdu (@RequestBody Tipo_empleo tipo){
        tipoExpServ.crearTipoExp(tipo);
    }    
    
     @PutMapping("/api/experiencia/tipo/edit")
     public void editarTipoExp(@RequestBody Tipo_empleo tipo) {
          tipoExpServ.crearTipoExp(tipo);
          
   }
    @DeleteMapping("/api/experiencia/tipo/delete/{id}")
    public void deleteTipoExp (@PathVariable Integer id){
        tipoExpServ.borrarTipoExp(id);
    }
}

