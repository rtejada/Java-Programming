package EjerciciosBásicos;

import java.util.Scanner;

public class ValidarNúmero {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        int num = 0;

        do {

            System.out.println("Ingresa un número");
            num = sc.nextInt();

            if ((!(num>=0 && num <=10))){
                System.out.println("Debes escribir un numero entre 0 y 10");
            }

        }while (!(num>=0 && num <=10)); // si no escribes entre 1 y 10 entra al do

        System.out.println("El numero " + num + " esta entre 0 y 10");



    }


}
