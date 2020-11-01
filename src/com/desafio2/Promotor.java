package com.desafio2;

public class Promotor extends Empleado{
    private int volantesRepartidos;
    private long valorVolante;
    private int comprasVolante;
    public Promotor(String nombre,int volantesRepartidos,int comprasVolante,long valorVolante) {
        super(nombre);
        this.comprasVolante = comprasVolante;
        this.volantesRepartidos = volantesRepartidos;
        this.valorVolante = valorVolante;
    }

    public int getVolantesRepartidos() {
        return volantesRepartidos;
    }

    public void setVolantesRepartidos(int volantesRepartidos) {
        this.volantesRepartidos = volantesRepartidos;
    }

    public long getValorVolante() {
        return valorVolante;
    }

    public void setValorVolante(long valorVolante) {
        this.valorVolante = valorVolante;
    }

    public int getComprasVolante() {
        return comprasVolante;
    }

    public void setComprasVolante(int comprasVolante) {
        this.comprasVolante = comprasVolante;
    }

    @Override
    public long calcularSalario() {
        return (long) ((this.getVolantesRepartidos()*this.getValorVolante())+(this.getComprasVolante()*15000));
    }
}
