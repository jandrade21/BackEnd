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
import portfolio.jandrade.model.User;
import portfolio.jandrade.service.IUserService;

/**
 *
 * @author yoni_
 */
@RestController

public class ControllerUser {
    
     @Autowired
    private IUserService userServ;
    
    @GetMapping ("/api/user")
    @ResponseBody
       public List<User> verPersonas(){
        return userServ.verUsuarios();
    }
    
    @GetMapping("/api/user/username")
    @ResponseBody
    public User usuario(){
       return userServ.findByUsername("jandrade");
    }
    
    @PostMapping("/api/user/login")
    @ResponseBody
    public User login (@RequestBody User us){
        return  (userServ.findByUsernameAndPassword(us.getUsername(),us.getPassword()));    
    }
    
    @PostMapping("/api/usuario/new")
    public void agregarUsuarios (@RequestBody User u){
        userServ.crearUsuario(u);
    }    
    
     @PutMapping("/api/usuario/edit")
     public void editarUsuarios(@RequestBody User u) {
         userServ.crearUsuario(u);
          
   }
    @DeleteMapping("/api/usuario/delete/{id}")
    public void deleteUsuarios (@PathVariable Integer id){
        userServ.borrarUsuario(id);
    }
}
