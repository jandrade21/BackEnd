/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portfolio.jandrade.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author yoni_
 */
@Getter
@Setter
@Entity

public class Persona {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="fechaNac")
    @Temporal(javax.persistence.TemporalType.DATE)
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date fecha_nac;
    @Column(name="telefono")
    private String telefono;
    @Column(name="correo")
    private String correo;
    @Column(name="sobre_mi", length = 2000)
    private String sobre_mi;
    @Column(name="url_img")
    private String url_img;
    @Column(name="domicilio")
    private String domicilio;

    public Persona() {
    }

    public Persona(Integer id, String nombre, String apellido, Date fecha_nac, String telefono, String correo, String sobre_mi, String url_img, String domicilio, User usuario, Experiencia Experiencia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
        this.telefono = telefono;
        this.correo = correo;
        this.sobre_mi = sobre_mi;
        this.url_img = url_img;
        this.domicilio = domicilio;
        this.usuario = usuario;
        this.Experiencia = Experiencia;
    }
    
    
 @OneToOne(cascade=CascadeType.ALL)
 @PrimaryKeyJoinColumn
    private User usuario;
 
 @OneToOne(cascade=CascadeType.ALL)
 @PrimaryKeyJoinColumn
  private Experiencia Experiencia;
}
