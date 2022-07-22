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
public class Proyecto implements Serializable {
     @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="descripcion")
    private String tipo;
    @Column(name="imagen")
    private String imagen;
    @Column(name="code")
    private String code;

    public Proyecto() {
    }

    public Proyecto(Integer id, String nombre, String descripcion, String imagen, String code) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = descripcion;
        this.imagen = imagen;
        this.code = code;
    }

 
            
    
}
