package CondicionalBucle;

import java.util.Scanner;

public class AdivinaNumero {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        //Genera numero aleatorio doble aleatorio double
        System.out.println(Math.random()*100);

        //Genera numero aleatorio entero, aplicando la refundición
        int aleatorio = (int)(Math.random()*100);
        System.out.println(aleatorio);

        int numero = 0;
        int intentos = 0;

        while (numero != aleatorio){

            intentos++;
            System.out.println("Introduce un número:");

            numero = sc.nextInt();

            if (aleatorio < numero) {

                System.out.println("Más bajo");
            } else if (aleatorio > numero){

                System.out.println("Más alto");
            }

        }
        System.out.println("Correcto" + " Lo has adivinado en "+ intentos + " intentos");
    }
}
