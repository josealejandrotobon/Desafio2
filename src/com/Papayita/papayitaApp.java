package com.Papayita;


import javax.swing.*;
import java.util.Arrays;

public class papayitaApp {
    public static final int JUEGO = 1;
    public static final int INSTRUCCIONES=0;

    public static void main(String[] args){
        Guayaba guayaba = new Guayaba("Guayaba");
        int opcion1,i,dinero,poteinicial,eleccion,dado;
        boolean continuar = true ; boolean controlador;
        String nombres,instrucciones = "INSTRUCCIONES \n 1.Deberan hacer una apuesta inicial todos los jugadores"+
                "\n 2.Comenzaran tirando el dado "+
                "\n 3.Si el número del dado es 1 o 6 el turno debera saltarse y el jugador que saco dichos numeros tendra un castigo de $100"+
                "\n 4.Si el numero esta entre 2 y 5 el jugador tendra la opcion de apostar o ceder el turno"+
                "\n 5.Si el jugador decide apostar podra elegir una cantidad a apostar que no pase aquella del pote ni de su dinero"+
                "\n 6.Volvera a lanzar el dado y si el numero que saque es mayor al anterior ganara el dinero apostado \n De lo contrario debera pagar la suma que quizo apostar"+
                "\n 7.Si los jugadores se quedan sin dinero iran saliendo del juego, si todos se quedan sin dinero la casa ganara \n Si el pote se queda sin dinero el/los jugadores ganaran";
        Icon icon = new ImageIcon(papayitaApp.class.getResource("Captura.PNG"));
        while (continuar)
        {
            opcion1 = JOptionPane.showOptionDialog(null,"Bienvenido al juego Guaiabita \n Elije una de las opciones:","Guayabita",0,0,icon, Arrays.asList("Instrucciones","Jugar").toArray(),
                    null);
            switch (opcion1)
            {
                case INSTRUCCIONES:{
                    JOptionPane.showMessageDialog(null,instrucciones);
                    break;
                }
                case JUEGO:{
                    guayaba.setNroparticipantes(Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de jugadores",0)));
                    for ( i = 0; i< guayaba.getNroparticipantes();i++){

                    nombres=JOptionPane.showInputDialog("ingrese el nombre del jugador "+(i+1));
                    dinero = Integer.parseInt(JOptionPane.showInputDialog("dinero del jugador"+(i+1)));
                    Jugador jugador = new Jugador(nombres,dinero);
                    guayaba.getListajugadores().add(jugador);
                }
                poteinicial=Integer.parseInt(JOptionPane.showInputDialog("ingrese el monto del pote incial",50));
                guayaba.sumaralpote((poteinicial* guayaba.getNroparticipantes()));
                for (int b = 0; b<guayaba.getNroparticipantes();b++)
                {
                    guayaba.getListajugadores().get(b).restardinero(guayaba.getListajugadores().get(b),poteinicial);
                }
                controlador = true;
                while(guayaba.getPote()!=0 && controlador==true)
                {
                    for(int c = 0; c< guayaba.getListajugadores().size();c++)
                    {
                        eleccion = JOptionPane.showConfirmDialog(null,guayaba.getListajugadores().get(c).getNombrejugador()+ "¿Deseas lanzar el dado?");
                        if(eleccion== JOptionPane.YES_OPTION)
                        {
                            dado = guayaba.Lanzardado();
                            Icon dados = new ImageIcon(papayitaApp.class.getResource("dado"+ dado + ".PNG"));
                            if (dado == 1||dado==6)
                            {
                                JOptionPane.showMessageDialog(null,guayaba.getListajugadores().get(c).getNombrejugador()+"Este es tu dado debes ,ceder tu turno y tedras una multa","Multa",0,dados);
                                guayaba.getListajugadores().get(c).restardinero(guayaba.getListajugadores().get(c),100);

                            }

                        }

                    }
                }

        } default: {
                continuar= false;
    }



            }

        }
    }
}


