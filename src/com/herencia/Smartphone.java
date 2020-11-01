package com.herencia;

public class Smartphone extends Celular{
    private short nroCamara;
    private short nroSims;
    private String generacionRed;
    private boolean internet;
    private double CapacidadMemoria;

    public double getCapacidadMemoria() {
        return CapacidadMemoria;
    }

    public void setCapacidadMemoria(double capacidadMemoria) {
        CapacidadMemoria = capacidadMemoria;
    }

    public short getNroCamara() {
        return nroCamara;
    }

    public short getNroSims() {
        return nroSims;
    }

    public String getGeneracionRed() {
        return generacionRed;
    }

    public boolean isInternet() {
        return internet;
    }
}
