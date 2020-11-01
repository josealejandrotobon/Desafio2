package com.herencia;

public class Celular {
    private String CodigoBarras;
    private String marca;
    private String operador;
    private byte añomodelo;
    private String modelo;

    private void llamar(){
        System.out.println("el celular llamo");
    }
    private void llamado(){
        System.out.println("sono el celular");
    }

    public String getCodigoBarras() {
        return CodigoBarras;
    }

    public String getMarca() {
        return marca;
    }

    public byte getAñomodelo() {
        return añomodelo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }
}
