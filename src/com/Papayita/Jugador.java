package com.Papayita;
public class Jugador {

    private String nombrejugador;
    private int dinerojugador;


    public Jugador(String nombrejugador, int dinerojugador) {
        this.nombrejugador = nombrejugador;
        this.dinerojugador = dinerojugador;
    }



    public String getNombrejugador() {
        return nombrejugador;
    }

    public void setNombrejugador(String nombrejugador) {
        this.nombrejugador = nombrejugador;
    }

    public int getDinerojugador() {
        return dinerojugador;
    }

    public void setDinerojugador(int dinerojugador) {
        this.dinerojugador = dinerojugador;
    }
    public int sumardinero(int dineroSuma) {
        dineroSuma= getDinerojugador();
        dineroSuma= dineroSuma + dinerojugador;
        return dineroSuma;

    }
    public int restardinero(Jugador jugador, int dineroresta) {
        dineroresta= getDinerojugador();
        dineroresta= dineroresta - dinerojugador;
        return dineroresta;

    }


}




