/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package portfolio.jandrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portfolio.jandrade.model.Proyecto;

/**
 *
 * @author yoni_
 */
@Repository
public interface ProyectoRepository  extends JpaRepository<Proyecto,Integer> {
    
}
