package CondicionalBucle;

import javax.swing.*;
import java.util.Scanner;

public class AreasSwitch {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Elige una opción: \n1. Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado: "));

                System.out.println("El area del cuadrado es: " + Math.pow(lado, 2));
                break;

            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base: "));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base: "));

                System.out.println("El Area del rectángulo: " + (base * altura));
                break;

            case 3:

                base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base: "));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base: "));

                System.out.println("El area del triángulo es: " + (base * altura)/ 2);
                break;

            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio: "));

                System.out.print("El area del circulo es: ");

                System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));
                break;

            default:
                System.out.println("La opción no es correcta");

        }

    }
}
