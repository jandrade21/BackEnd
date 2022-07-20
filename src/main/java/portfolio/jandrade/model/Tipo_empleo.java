/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portfolio.jandrade.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author yoni_
 */
@Entity
@Getter
@Setter
public class Tipo_empleo implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    @Column(name="empleo_tipo")
    private String empleo_tipo; 

    public Tipo_empleo() {
    }

    public Tipo_empleo(Integer id, String empleo_tipo) {
        this.id = id;
        this.empleo_tipo = empleo_tipo;
    }
    
    
}
