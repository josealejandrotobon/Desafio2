package com.PesoPlanetas.Domain;

import javax.swing.*;

public class PesoAPP {
    public static void main(String[] args)
    {
        String[] Planetas = {
                "elije el planeta deseado",
                "mercurio",
                "saturno",
                "marte",
                "jupiter"
        };
        Icon icon = new ImageIcon(PesoAPP.class.getResource("planetas.jpg"));
        Persona persona = new Persona("Nueva persona");
        String nombre =persona.setNombre(JOptionPane.showInputDialog("Ingresa tu nombre","nombre"));
        int peso = persona.setPeso(Integer.parseInt(JOptionPane.showInputDialog("ingresa tu peso","peso")));


       String planeta= JOptionPane.showInputDialog(null,"Escoje el planeta en el que quieres medir tu peso","Medidor de pesos",JOptionPane.PLAIN_MESSAGE,icon,Planetas,Planetas[0]).toString();

        if (planeta == "marte")
        {
            double pesoMarte= peso*3.71;
            JOptionPane.showMessageDialog(null,"El peso de:"+ nombre+" en Marte es de "+ pesoMarte+"kilogramos");
        }
        if (planeta == "mercurio")
        {
            double pesoMercurio= peso*3.70;
            JOptionPane.showMessageDialog(null,"El peso de:"+ nombre +" en Mercurio es de "+ pesoMercurio+"kilogramos");
        }
        if (planeta == "jupiter")
        {
            double pesoJupiter= peso*23.12;
            JOptionPane.showMessageDialog(null,"El peso de:"+ nombre+" en Jupiter es de "+ pesoJupiter+"kilogramos");
        }
        if (planeta == "saturno")
        {
            double pesoSaturno= peso*8.96;
            JOptionPane.showMessageDialog(null,"El peso de:"+ nombre+" en Saturno es de "+ pesoSaturno+"kilogramos");
        }
    }

}


