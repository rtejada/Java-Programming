package CondicionalBucle.Scanner;

import java.util.Scanner;

public class ClaseScanner {

    public static void main(String arg[]) {

        //CondicionalBucle.Scanner , nextLine, nextInt nextDouble
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre, por favor: ");
        String nombre = entrada.nextLine();

        System.out.println("Introduce tu edad, por favor: ");
        int edad = entrada.nextInt();

        System.out.println("Hola "+ nombre + ". El año que viene tendras "+(edad+1)+ " años");

        entrada.close();

    }
}
