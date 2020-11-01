package com.desafio2;





import java.util.ArrayList;
import java.util.List;

public class Nomina {
    public static void main(String[] args){
        List<Empleado> empleados = new ArrayList<>();

        Directo Juan = new Directo("Juan",4840000);
        Vendedor Julian = new Vendedor("Julian",2050000,45510000);
        Freelance Johanna= new Freelance("Johanna",71000,89);
        Vendedor Carolina = new Vendedor("Carolina",980000,35989000);
        Promotor Pedro= new Promotor("Pedro",1200,62,300);
        Directo David = new Directo("David",3975000);
        Freelance Gustavo= new Freelance("Gustavo",42500,65);
        empleados.add(Juan);
        empleados.add(Julian);
        empleados.add(Johanna);
        empleados.add(Carolina);
        empleados.add(Pedro);
        empleados.add(David);
        empleados.add(Gustavo);
        calcularNomina(empleados);
        listardirectos(empleados);
        listarPromotores(empleados);
        listarFreelancers(empleados);


    }
    private static void calcularNomina(List<Empleado> empleados){
        empleados.forEach(empleado -> {
            System.out.println("el salario del empleado: "+ empleado.getNombre()+ " es " + empleado.calcularSalario());
        });
    }

    private static void listardirectos(List<Empleado> empleados) {
        empleados.forEach(empleado -> {
            if (empleado instanceof Directo){
                System.out.println("el empleado "+ empleado.getNombre() +" es empleado directo ");

            }
        });
    }
    private static void listarFreelancers(List<Empleado> empleados) {
        empleados.forEach(empleado -> {
            if (empleado instanceof Freelance){
                System.out.println("el empleado "+ empleado.getNombre() +" es Freelancer ");

            }
        });
    }
    private static void listarPromotores(List<Empleado> empleados) {
        empleados.forEach(empleado -> {
            if (empleado instanceof Promotor){
                System.out.println("el empleado "+ empleado.getNombre() +" es promotor");

            }
        });
    }





}


