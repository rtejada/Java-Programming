package CondicionalBucle;

import java.util.Scanner;

public class EvaluaEdad {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos años tienes? ");
        int edad = sc.nextInt();

        if (edad < 18){

            System.out.println("Eres un adolescente");

        } else if (edad < 40) {

            System.out.println("Eres joven");

        } else if (edad < 65) {

            System.out.println("Eres maduro");

        } else {
            System.out.println("Cuídate");
        }

    }
}
