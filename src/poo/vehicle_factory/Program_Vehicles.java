package poo.vehicle_factory;

import java.util.ArrayList;
import java.util.List;

public class Program_Vehicles {

    public static void main(String arg[]){

        List<Vehicles> list = new ArrayList<Vehicles>();

        list.add(new Auto("BMW", 100, 8, "MX25"));
        list.add(new Auto("Dacia", 90, 7, "M445"));
        list.add(new Bicycle("Bicicleta Deportiva", 30, 2));
        list.add(new Bicycle("Bicicleta de Montaña", 30, 2));

        for (int i=0; i<list.size(); i++){

            System.out.println("Description: " + list.get(i).getDescription());

            System.out.println("potencia: " + list.get(i).getPower());
        }


        /*

        Auto auto = new Auto("Unico", 150,900, "Bueno");
        Bycicle bycicle = new Bycicle("moderno", 50, 20.5);

        System.out.println("Descripcion de los Vehiculos");
        System.out.println("Autos: ");
        System.out.println("Descripcion: " + auto.getDescription());
        System.out.println("Velocidad: " + auto.getSpeed() + " k/h");
        System.out.println("Fuerza: " + auto.getForce() + " caballos");
        System.out.println("Motor: " + auto.getMotor());
        System.out.println("Potencia: " + auto.getPower());

        System.out.println();

        System.out.println("Bicicleta: ");
        System.out.println("Descripcion: " + bycicle.getDescription());
        System.out.println("Velocidad: " + bycicle.getSpeed() + " k/h");
        System.out.println("Fuerza: " + bycicle.getForce() + " revoluciones");
        System.out.println("Potencia " + bycicle.getPower());
*/


    }

}
