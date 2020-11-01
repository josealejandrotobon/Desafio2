package com.PesoPlanetas.Domain;

public class Persona {
    private String nombre;
    private int peso;

    public Persona(String nueva_persona) {
    }

    public String getNombre() {
        return nombre;
    }

    public String setNombre(String nombre) {
        this.nombre = nombre;
        return nombre;
    }

    public int getPeso() {
        return peso;
    }

    public int setPeso(int peso) {
        this.peso = peso;
        return peso;
    }

    public Persona(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
    }
}
