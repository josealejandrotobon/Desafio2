package com.herencia;

public class Estudiante extends Persona {
    private String lugarEstudio;
    private String carrera;
    private short semestre;

    public String getLugarEstudio() {
        return lugarEstudio;
    }

    public void setLugarEstudio(String lugarEstudio) {
        this.lugarEstudio = lugarEstudio;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public short getSemestre() {
        return semestre;
    }

    public void setSemestre(short semestre) {
        this.semestre = semestre;
    }
}
