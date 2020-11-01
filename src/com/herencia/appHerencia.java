package com.herencia;

import java.util.ArrayList;
import java.util.List;

public class appHerencia {
    public static void main(String[] args){
        List<Persona> personas = new ArrayList<>();
        Persona juan= new Persona();
        Profesor profealejo = new Profesor();
        Estudiante alumnojose = new Estudiante();
        personas.add(juan);
        personas.add(profealejo);
        personas.add(alumnojose);
        mostrarpersonas(personas);


        }

    private static void mostrarpersonas(List<Persona> personas) {
        personas.forEach(persona -> {
            if (persona instanceof Profesor){
                System.out.println(persona + "Es un profesor");
            }
            else if (persona instanceof Estudiante){
                System.out.println(persona + "es un estudiante");
            }
            else if (persona instanceof Persona){
                System.out.println(persona+"es una persona ");
            }
        });


    }


}

