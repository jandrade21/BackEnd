/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portfolio.jandrade.model;

import java.io.Serializable;
import java.util.List;
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
public class Tipo_edu implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    @Column(name="educacion_tipo")
    private String educacion_tipo;   

   
    public Tipo_edu() {
}
  
   public Tipo_edu(Integer id, String educacion_tipo) {
       this.id = id;
       this.educacion_tipo = educacion_tipo;
    }

}
