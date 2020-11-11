package com.Quiz3;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Recurso> recursos;

    public Biblioteca() {
        this.recursos = new ArrayList<>();
    }

    public void addRecurso(Recurso recursos) {

            this.recursos.add(recursos);

        }


    public boolean prestarRecurso(Prestable prestable, Recurso recurso ) {
        if( prestable!= null && recurso.Prestado ){
            prestable.Prestar();
            return true;


        }
        return false;
        }



    public boolean devolverRecurso(Prestable prestable, Recurso recurso) {
            if(prestable!=null && recurso.Prestado){
                prestable.Devolver();
                return true;
            }
            return false;
        }


    public void listarPrestados(Recurso rprestado)
    {
        boolean noPrestado = recursos.stream().anyMatch(r -> r.Prestado == rprestado.Prestado);
        if(!noPrestado || rprestado.Prestado == true)
        {
            this.recursos.add(rprestado);
            System.out.println(rprestado);
        }
    }


    }


