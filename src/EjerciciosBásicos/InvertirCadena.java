package EjerciciosBásicos;

import java.util.Scanner;

public class InvertirCadena {

    public static void main(String arg []) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        System.out.println("Inserta una frase o palabra");
        String frase = sc.next();

        String invertida = "";

        for (int i=frase.length()-1; i>= 0; i--) {

            invertida+=frase.charAt(i);

        }

        System.out.println("Frase invertida: " + invertida);

    }
}
