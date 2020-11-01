package com.herencia;

public class Persona {
    private String id;
    private byte edad;
    private String nombre;
    private String nacionalidad;

    public void aprender(){
        System.out.println("la persona aprende");
    }
    public void enseñar(){
        System.out.println("la persona enseña");
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }
}
