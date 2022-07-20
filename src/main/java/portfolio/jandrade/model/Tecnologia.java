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
@Getter
@Setter
@Entity
public class Tecnologia implements Serializable {
     @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    @Column(name="nombre_tecno")
    private String nombre_tecno;
    @Column(name="porcentaje")
    private Integer porcentaje;
    @Column(name="imagen")
    private String imagen;
    @Column(name="color")
    private String color;

    public Tecnologia() {
    }

    public Tecnologia(Integer id, String nombre_tecno, Integer porcentaje, String imagen, String color) {
        this.id = id;
        this.nombre_tecno = nombre_tecno;
        this.porcentaje = porcentaje;
        this.imagen = imagen;
        this.color = color;
    }
    
}
