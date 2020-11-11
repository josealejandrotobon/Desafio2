package com.Quiz3;

public class Libro extends Recurso implements Prestable{
    public Libro(boolean prestado, String nombre) {
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
        return this.getNombre();
    }
}
