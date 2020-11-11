package com.Quiz3;

public class Comic extends Recurso implements  Prestable {
    public Comic(boolean prestado, String nombre) {
        super(prestado, nombre);
    }


    @Override
    public void Prestar() {
        this.Prestado = true;
    }

    @Override
    public void Devolver() {

        this.Prestado = false;
    }

    @Override
    public String toString() {
        return this.Nombre;
    }
}


