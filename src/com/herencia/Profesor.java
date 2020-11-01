package com.herencia;

public class Profesor extends Persona{
    private String enseña;
    private String lugarDondeEnseña;
    private byte añosExperiencia;

    public String getEnseña() {
        return enseña;
    }

    public void setEnseña(String enseña) {
        this.enseña = enseña;
    }

    public String getLugarDondeEnseña() {
        return lugarDondeEnseña;
    }

    public void setLugarDondeEnseña(String lugarDondeEnseña) {
        this.lugarDondeEnseña = lugarDondeEnseña;
    }

    public byte getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(byte añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
}
