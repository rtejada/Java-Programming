package simpleCalculator;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String arg[]){

        int option = 0;
        Scanner sc;
        sc = new Scanner(System.in);

        do {
            System.out.println("\n");
            System.out.println("****CALCULATOR***");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Resto");
            System.out.println("0. Salir del Programa");
            System.out.print("Introduzca una opcion válida: ");

            //nextLine - transpforma la cadena de caracter en un valor entero
            option = Integer.parseInt(sc.nextLine());

            if (option < 0 || option > 5) {
                System.out.print("Opcion no válida. Vuelva a escoger");

            } else if (option != 0) {
                System.out.println("\n");

                float operando1, operando2;

                System.out.print("Introduzca el primer operando: ");
                operando1 = Float.parseFloat(sc.nextLine());

                System.out.print("Introduzca el segundo operando: ");
                operando2 = Float.parseFloat(sc.nextLine());

                System.out.println("\n");

                switch (option) {

                    case 1:
                        System.out.println("El resultado de la suma es: " + (operando1 + operando2));
                        break;

                    case 2:
                        System.out.println("El resultado de la resta es: " + (operando1 - operando2));
                        break;

                    case 3:
                        System.out.println("El resultado de la multiplicación es: " + (operando1 * operando2));
                        break;

                    case 4:
                        System.out.println("El resultado de la división es: " + (operando1 / operando2));
                        break;

                    case 5:
                        System.out.println("El resto de dividir : " + operando1 + " entre " + operando2 + " es: " + (operando1 % operando2));
                        break;
                }
            }


        } while (option != 0);
            sc.close();
            System.out.println("Finalizando la ejecución de la calculadora");


    }
}
