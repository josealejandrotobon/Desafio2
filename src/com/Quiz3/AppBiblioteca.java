package com.Quiz3;

public class AppBiblioteca {
    public static void main(String[] args) {
        Biblioteca bibliotecaElRetiro = new Biblioteca();
        Libro ElHobbit = new Libro(true,"El hobbit");
        Revista semana= new Revista(false,"Semana");
        Tesis Poo = new Tesis(false,"Tesis de programacion");
        Comic marvel= new Comic(true, "Spiderman");
        Diccionario larousse = new Diccionario(false,"Larousse español");
        bibliotecaElRetiro.addRecurso(ElHobbit);
        bibliotecaElRetiro.addRecurso(semana);
        bibliotecaElRetiro.addRecurso(Poo);
        bibliotecaElRetiro.addRecurso(marvel);
        bibliotecaElRetiro.addRecurso(larousse);
        bibliotecaElRetiro.devolverRecurso(ElHobbit,ElHobbit);
        //bibliotecaElRetiro.prestarRecurso(semana,semana); %%tengo un error que no me permite mostrar como prestado
        bibliotecaElRetiro.listarPrestados(ElHobbit);
        bibliotecaElRetiro.listarPrestados(semana);
        bibliotecaElRetiro.listarPrestados(Poo);
        bibliotecaElRetiro.listarPrestados(marvel);
        bibliotecaElRetiro.listarPrestados(larousse);







    }
}

