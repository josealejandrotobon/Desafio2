package com.desafio2;

public class Freelance extends Empleado {
    private long valorHora;
    private int horasTrabajadas;
    public Freelance(String nombre, long valorHora,int horasTrabajadas) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;

    }

    public long getValorHora() {
        return valorHora;
    }

    public void setValorHora(long valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public long calcularSalario() {
        return (long)(this.getHorasTrabajadas()*this.getValorHora());
    }
}
