package com.polaflix.domain;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
@Id
private Long id;
private String nombre;
private String correo;
private Integer telefono;
private Integer edad;
private String pais;
private String direccion;
private String cuenta_bancaria;

public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getCorreo() {
    return correo;
}
public void setCorreo(String correo) {
    this.correo = correo;
}

public int getTelefono() {
    return telefono;
}
public void setTelefono(int telefono) {
    this.telefono = telefono;
}

public int getEdad() {
    return edad;
}
public void setEdad(int edad) {
    this.edad = edad;
}
public String getPais() {
    return pais;
}
public void setPais(String pais) {
    this.pais = pais;
}


public String getDireccion() {
    return direccion;
}
public void setDireccion(String direccion) {
    this.direccion = direccion;
}

public String getCuentaBancaria() {
    return cuenta_bancaria;
}
public void setCuentaBancaria(String cuenta_bancaria) {
    this.cuenta_bancaria = cuenta_bancaria;
}

    
}
