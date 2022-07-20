/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portfolio.jandrade.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author yoni_
 */
@Getter
@Setter
@Entity
public class Experiencia implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    @Column(name="empresa")
    private String empresa;
    @Column(name="actual")
    private Boolean actual;
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(name="fechaInicio")
    private Calendar fechaInicio;    
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(name="fechaFin")
    private Calendar fechaFin; 
    @Column(name="descripcion", length = 2000)
    private String descripcion;
    @Column(name="imagen")
    private String imagen;  

    public Experiencia() {
    }

    public Experiencia(Integer id, String empresa, Boolean actual, Calendar fechaInicio, Calendar fechaFin, String descripcion, String imagen, Tipo_empleo Tipo_empleo) {
        this.id = id;
        this.empresa = empresa;
        this.actual = actual;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.Tipo_empleo = Tipo_empleo;
    }

    
    @ManyToOne
    @JoinColumn(name="tipoemp_id")
    @PrimaryKeyJoinColumn
    @JsonBackReference
     private Tipo_empleo Tipo_empleo;
}
