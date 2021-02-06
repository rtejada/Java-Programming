package Variables;

import java.util.Scanner;

public class ConcatenaPalabras {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        //sc.useDelimiter("\n");

        String cadena = "";
        String palabra;
        System.out.println("Inserta una cadena: ");
        palabra = sc.nextLine();


        while (!palabra.equals("")) { //!palabra.isEmpty()

            cadena += palabra + " ";
            System.out.println("Inserta otra cadena: ");
            palabra = sc.nextLine();


        }

        System.out.println("Palabras insertadas: " + cadena);


    }



}
