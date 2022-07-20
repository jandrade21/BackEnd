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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author yoni_
 */
@Entity 
@Getter
@Setter
public class Educacion implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    @Column(name="escuela")
    private String escuela;
    @Column(name="titulo")
    private String titulo;
     @Temporal(TemporalType.DATE)
     @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(name="inicio")
    private Calendar inicio;    
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(name="fin")
    private Calendar fin;  
    @Column(name="imagen")
    private String imagen;  

    public Educacion() {
    }
    
 
    public Educacion(Integer id, String escuela, String titulo, Calendar inicio, Calendar fin, String imagen, Tipo_edu Tipo_edu) {
        this.id = id;
        this.escuela = escuela;
        this.titulo = titulo;
        this.inicio = inicio;
        this.fin = fin;
        this.imagen = imagen;
        this.Tipo_edu = Tipo_edu;
    }

        @ManyToOne
        @JoinColumn(name="tipoedu_id")
        @PrimaryKeyJoinColumn
        @JsonBackReference
         private Tipo_edu Tipo_edu;

       
}
