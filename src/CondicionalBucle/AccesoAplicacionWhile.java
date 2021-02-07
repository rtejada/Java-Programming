package CondicionalBucle;

import javax.swing.*;

public class AccesoAplicacionWhile {

    public static void main(String arg[]) {

        String clave = "pepe";
        String pass = "";

        while (clave.equals(pass) == false){

            pass = JOptionPane.showInputDialog("Introduce la contraseña: ");

            if (clave.equals(pass) == false){

                System.out.println("Contraseña incorrecta");
            }
        }

        System.out.println("Contraseña correcta");
    }
}
