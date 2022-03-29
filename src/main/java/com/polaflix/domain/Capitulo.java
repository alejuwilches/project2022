package com.polaflix.domain;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Capitulo implements Serializable {
      

    @Id
    private Long id;
    private int numero;
    private String tituloCapitulo;
    private String descripcion;
    private String enlace;
    private int duracion;
     
    @ManyToOne
    private Serie serie;

    @ManyToOne
    private Temporada temporada;


    public Capitulo(int numero, String tituloCapitulo, String descripcion, String enlace, Serie serie, Temporada temporada){
        super();
        this.numero = numero;
        this.tituloCapitulo = tituloCapitulo;
        this.descripcion = descripcion;
        this.enlace = enlace;
        this.serie = serie;
        this.temporada = temporada;

    }



    public Long getId() {
        return id;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
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
