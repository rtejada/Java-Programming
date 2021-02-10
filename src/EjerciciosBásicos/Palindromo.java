package EjerciciosBásicos;

import java.util.Scanner;

public class Palindromo {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("Escribe una fase: ");

        //trim() aelimina espacios de adelante y atras
        String frase = sc.next().trim();
        String palindromo = "";

        for (int i=frase.length()-1; i>=0; i--) {
            palindromo += frase.charAt(i);

        }

        if (frase.equals(palindromo)){

            System.out.println("Es palindromo: "+ palindromo);

        } else {

            System.out.println("No es un palindromo " + palindromo);
        }



    }
}
