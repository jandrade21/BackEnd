/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package portfolio.jandrade.service;

import java.util.List;
import portfolio.jandrade.model.User;

/**
 *
 * @author yoni_
 */
public interface IUserService {
    
    public List<User> verUsuarios();
    
    public void crearUsuario(User u);
    
    public void borrarUsuario(Integer id);
    
    public User buscarUsuario(Integer id);

    public User findByUsername(String jandrade);

    public User findByUsernameAndPassword(String username, String password);
    
}
