package CondicionalBucle.Scanner;

import javax.swing.*;

public class EntradaNumeros {

    public static void main(String arg[]) {

        double x = 1000.0;
        System.out.printf("%1.2f", x/3);

        System.out.print("\n");

        String num1 = JOptionPane.showInputDialog("Introduce un numero: ");
        double num2 = Double.parseDouble(num1);

        System.out.print("La raiz de " + num2 + " es ");
        System.out.printf("%1.2f", Math.sqrt(num2));
    }
}
