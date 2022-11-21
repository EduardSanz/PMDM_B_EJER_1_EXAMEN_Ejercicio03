package com.cieep.ejercicio03.modelos;

import java.io.Serializable;

public class Personaje implements Serializable {

    private int nombre;
    private int imagen;
    private int descripcion;

    public Personaje(int nombre, int imagen, int descripcion) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.descripcion = descripcion;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(int descripcion) {
        this.descripcion = descripcion;
    }
}
