package com.polaflix.domain;
 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "serie")
public class Serie {

    @Id
    private int id;
    
    private String titulo;
    private String resenia;
    private String clasificacion;
    private String creadores;
    private String directores;
    private String imagen;
    private String categoria;



    public Serie(int id, String titulo, String resenia, String clasificacion, String creadores, String directores,
            String imagen, String categoria) {
        this.id = id;
        this.titulo = titulo;
        this.resenia = resenia;
        this.clasificacion = clasificacion;
        this.creadores = creadores;
        this.directores = directores;
        this.imagen = imagen;
        this.categoria = categoria;
        
    }

    @OneToMany
    private Capitulo capitulo;

    public int getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResenia() {
        return this.resenia;
    }

    public void setResenia(String resenia) {
        this.resenia = resenia;
    }

    public String getClasificacion() {
        return this.clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getDirectores() {
        return this.directores;
    }

    public void setDirectores(String directores) {
        this.directores = directores;
    }


    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getCreadores() {
        return creadores;
    }

    public void setCreadores(String creadores) {
        this.creadores = creadores;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    
    


}
