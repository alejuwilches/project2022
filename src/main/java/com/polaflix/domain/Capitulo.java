package com.polaflix.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "capitulo")
public class Capitulo implements Serializable {
      

    @Id
    private Long numero;
    private String tituloCapitulo;
    private String descripcion;
    private String enlace;
    private int duracion;
     
    @ManyToOne
    private Serie serie;

    @ManyToOne
    private Temporada temporada;


    public Capitulo(Long numero, String tituloCapitulo, String descripcion, String enlace, Serie serie, Temporada temporada){
        super();
        this.numero = numero;
        this.tituloCapitulo = tituloCapitulo;
        this.descripcion = descripcion;
        this.enlace = enlace;
        this.serie = serie;
        this.temporada = temporada;

    }


    public long getNumero() {
        return this.numero;
    }

    public String getTituloCapitulo() {
        return this.tituloCapitulo;
    }

    public void setTituloCapitulo(String tituloCapitulo) {
        this.tituloCapitulo = tituloCapitulo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEnlace() {
        return this.enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public Integer getDuracion() {
        return this.duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
    
    
}
