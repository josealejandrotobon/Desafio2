package com.Quiz3;

public class Diccionario extends Recurso {
    public Diccionario(boolean prestado, String nombre) {
        super(prestado, nombre);
    }

    @Override
    public String toString() {
        return this.Nombre;
    }
}

