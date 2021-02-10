package EjerciciosBásicos;

import java.util.Scanner;

public class AdivinaNumero {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        int aleatorio = 0;
        System.out.println("Inserta un numero: ");

        aleatorio= (int)(Math.random()*100);
        int numInsertado = 0;
        int intentos = 0;

        do {
            intentos++;
            numInsertado = sc.nextInt();

            if (aleatorio < numInsertado){

                System.out.println("Debes insertar un numero menor");

            } else if (aleatorio > numInsertado) {

                System.out.println("Debes insertar un numero mayor");
            }
        }while (aleatorio != numInsertado);

        System.out.println("Correcto! has adivinada en "+ intentos + " intentos");
    }
}
