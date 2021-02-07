package CondicionalBucle;

import javax.swing.*;
import java.util.Scanner;

public class PesoIdeal {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        String genero = "";


        do {
            genero = JOptionPane.showInputDialog("Introduce tu generos (H/M)");


        } while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm: "));

        int pesoIdeal = 0;
        if (genero.equalsIgnoreCase("H")) {

            pesoIdeal = altura - 110;
        } else if (genero.equalsIgnoreCase("M")) {

            pesoIdeal = altura - 120;
        }

        System.out.println("Tu peso ideal es " + pesoIdeal + "kg");

    }
}
