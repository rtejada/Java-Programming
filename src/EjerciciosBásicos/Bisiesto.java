package EjerciciosBásicos;

import java.util.Scanner;

public class Bisiesto {

    public static void main(String arg[]) {

        System.out.println("****Programa que te informa si un año es Bisiesto o no ****");
        System.out.println("\n ");

        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta el año que deseas consultar: ");
        int anio = sc.nextInt();

        if (anio%4==0 && anio%100 != 0 || anio%400 == 0) {

            System.out.println("El año "+ anio + " es Bisiesto ");

        } else {
            System.out.println("El año "+ anio + " no es Bisiesto ");
        }



    }
}
