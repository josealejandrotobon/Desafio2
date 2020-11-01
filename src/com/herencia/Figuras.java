package com.herencia;

public class Figuras {
    private double Area;
    private int NroLados;

    public double getArea() {
        return Area;
    }

    public int getNroLados() {
        return NroLados;
    }

    private void calcular(){
        System.out.println("se hicieron calculos de la figura");
    }
}
