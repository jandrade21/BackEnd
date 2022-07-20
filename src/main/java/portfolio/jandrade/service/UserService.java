/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portfolio.jandrade.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.jandrade.model.User;
import portfolio.jandrade.repository.UserRepository;

/**
 *
 * @author yoni_
 */
@Service
public class UserService implements IUserService{
    
    @Autowired
    public UserRepository userRepo;
   

    @Override
    public List<User> verUsuarios() {
        return userRepo.findAll();
    }

    @Override
    public void crearUsuario(User u) {
       userRepo.save(u);
    }

    @Override
    public void borrarUsuario(Integer id) {
       userRepo.deleteById(id);
    }

    @Override
    public User buscarUsuario(Integer id) {
       return userRepo.findById(id).orElse(null);
    }

    @Override
    public User findByUsername(String jandrade) {
       return userRepo.findByUsername(jandrade);
    }

    @Override
    public User findByUsernameAndPassword(String username, String password) {
       return userRepo.findByUsernameAndPassword(username, password);
    }
    
}
