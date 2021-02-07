package CondicionalBucle.Variables;

import java.util.Scanner;

public class RecorrerCadena {

    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta una cadena de carateres: ");
        String cadena = sc.next();


        for (int i=0; i<cadena.length(); i++){

            System.out.println(cadena.charAt(i));
        }



        sc.close();


    }
}
