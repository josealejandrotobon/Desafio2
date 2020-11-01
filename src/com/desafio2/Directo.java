package com.desafio2;

public class Directo extends Empleado {
    private long salario;
    public Directo(String nombre, long salario) {
        super(nombre);
        this.salario = salario;
    }

    @Override
    public long calcularSalario() {
        return (long) (this.getSalario()-this.calcularSalud() - this.calcularPension());
    }
    public long calcularSalud(){
        return (long) (this.getSalario()*0.05);
    }
    public long calcularPension(){
        return (long) (this.getSalario()*0.065);
    }

    public long getSalario() {
        return salario;
    }


}
