package EjerciciosBásicos;

import java.util.Scanner;

public class MiniCalculadora {

    static public void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

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
            opcion = Integer.parseInt(sc.nextLine());

            if (opcion < 0 || opcion > 5) {
                System.out.println("Debes insertar un numero comprendido entre 1 y 5");

            }else if (opcion != 0){

                float num1, num2;

                System.out.println("Inserta el numero 1: ");
                num1 = Float.parseFloat(sc.nextLine());

                System.out.println("Inserta el numero 2: ");
                num2 = Float.parseFloat(sc.nextLine());


                switch (opcion){
                    case 1:
                        System.out.println("El resultado de la suma es: "+ (num1 + num2));
                        break;

                    case 2:
                        System.out.println("El resultado de la resta es: "+ (num1 - num2));
                        break;

                    case 3:
                        System.out.println("El resultado de la multiplicacion es: "+ (num1 * num2));
                        break;

                    case 4:
                        if (num1 == 0){
                            System.out.println("No se puede dividr un numero entre 0");

                        } else
                            System.out.println("El resultado de la division es: "+ (num1 / num2));

                        break;

                    case 5:
                        System.out.println("El resultado del resto es: "+ (num1 % num2));
                        break;

                }

            }

        } while (opcion!=0);

        System.out.println("Gracias por utilizar el programa");

    }
}
