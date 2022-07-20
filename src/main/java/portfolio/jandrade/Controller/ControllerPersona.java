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
import portfolio.jandrade.model.Persona;
import portfolio.jandrade.service.IPersonaService;

/**
 *
 * @author yoni_
 */
@RestController

public class ControllerPersona {
    
    @Autowired
    private IPersonaService persoServ;
    
    @GetMapping ("/api/persona")
    @ResponseBody
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    
    @PostMapping("/api/persona/new")
    public void agregarPersona (@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }    
    
     @PutMapping("/api/persona/edit")
     public void editarPersona(@RequestBody Persona pers) {
          persoServ.crearPersona(pers);
          
   }
    @DeleteMapping("/api/persona/delete/{id}")
    public void deletePersona (@PathVariable Integer id){
        persoServ.borrarPersona(id);
    }
    
    
}
