package com.Quiz3;

public class Tesis extends Recurso {
    public Tesis(boolean prestado, String nombre) {
        super(prestado, nombre);
    }

    @Override
    public String toString() {
        return this.Nombre;
    }
}
