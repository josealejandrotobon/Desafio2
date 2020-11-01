package com.desafio2;

public class Vendedor extends Directo {
    private long ventasDelMes;
    private static final int salbase = 1000000;

    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;

    }

    @Override
    public long calcularSalario() {
        return (long)(super.calcularSalario()+this.CalcularComision());
    }

    public long CalcularComision() {
        if (this.getSalario() >= salbase) {
            return (long) (this.getVentasDelMes() * 0.035);
        } else {
            return (long) (this.getVentasDelMes() * 0.04);

        }
    }
        public long getVentasDelMes () {
            return ventasDelMes;
        }

}

