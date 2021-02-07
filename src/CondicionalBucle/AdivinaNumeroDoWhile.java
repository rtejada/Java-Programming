package CondicionalBucle;

import java.util.Scanner;

public class AdivinaNumeroDoWhile {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        int aleatorio = (int)(Math.random()*100);


        int numero = 0;
        int intentos = 0;

        do{

            intentos++;
            System.out.println("Introduce un número:");

            numero = sc.nextInt();

            if (aleatorio < numero) {
                System.out.println("Más bajo");

            } else if (aleatorio > numero){
                System.out.println("Más alto");

            }

        }while (numero != aleatorio);

        System.out.println("Correcto" + " Lo has adivinado en "+ intentos + " intentos");
    }
}

