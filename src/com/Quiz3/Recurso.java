package com.Quiz3;

public abstract class Recurso {
    protected boolean Prestado;
    String Nombre;

    public boolean isPrestado() {
        return Prestado;
    }

    public String getNombre() {
        return Nombre;
    }

    public Recurso(boolean prestado, String nombre) {
        Prestado = prestado;
        Nombre = nombre;
    }
}
