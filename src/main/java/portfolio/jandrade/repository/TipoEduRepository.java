/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package portfolio.jandrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import portfolio.jandrade.model.Tipo_edu;

/**
 *
 * @author yoni_
 */
public interface TipoEduRepository extends JpaRepository<Tipo_edu,Integer> {
    
}
