package CondicionalBucle.Scanner;

import javax.swing.*;

public class ClaseJOptionPane {

    public static void main(String arg[]) {

        String nombre = JOptionPane.showInputDialog("Introduce tu nombre, por favor: ");
        String edad = JOptionPane.showInputDialog("Introduce la edad, por favor: ");

        //parseInt(convierte a numero entero)
        int edad_usuario = Integer.parseInt(edad);
        edad_usuario++;

        System.out.println("Hola " + nombre + ". Tienes "+ edad+ " años");

        System.out.println("Hola "+ nombre + ". El año que viene tendrás "+ edad_usuario + " años");



    }
}
