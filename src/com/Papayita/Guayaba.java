package com.Papayita;

import java.util.ArrayList;
import java.util.List;

public class Guayaba {
    public Jugador participantes;
    public List<Jugador> listajugadores =new ArrayList<>();
    private int nroparticipantes;
    private int pote =0;
    private int apostado=0;
    private int Final = 0;
    public String nombre;



    public short Lanzardado(){
        short dado;
        dado=(short) Math.floor(Math.random()*5+1);
        return dado;
    }

    public int getNroparticipantes() {
        return nroparticipantes;
    }

    public void setNroparticipantes(int nroparticipantes) {
        this.nroparticipantes = nroparticipantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPote() {
        return pote;
    }

    public void setPote(int pote) {
        this.pote = pote;
    }

    public int getApostado() {
        return apostado;
    }

    public void setApostado(int apostado) {
        this.apostado = apostado;
    }

    public Jugador getParticipantes(int b) {
        return participantes;
    }

    public void setParticipantes(Jugador participantes) {
        this.participantes = participantes;
    }

    public List<Jugador> getListajugadores() {
        return listajugadores;
    }

    public void setListajugadores(List<Jugador> listajugadores) {
        this.listajugadores = listajugadores;
    }

    public Guayaba(String nombre) {
        this.nombre = nombre;
    }

    public Guayaba(Jugador participantes, List<Jugador> listajugadores, int pote, int apostado) {
        this.participantes = participantes;
        this.listajugadores = listajugadores;
        this.pote = pote;
        this.apostado = apostado;
    }


    public int sumaralpote(int poteSuma) {
        poteSuma= getPote();
        poteSuma= poteSuma + pote;
        return poteSuma;

    }
    public int restaralpote(int poteresta) {
        poteresta= getPote();
        poteresta= poteresta - pote;
        return poteresta;

    }
}

