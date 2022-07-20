/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package portfolio.jandrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import portfolio.jandrade.model.Tecnologia;

/**
 *
 * @author yoni_
 */
public interface TecnologiaRepository extends JpaRepository<Tecnologia,Integer>{
    
}
