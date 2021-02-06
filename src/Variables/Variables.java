package Variables;

import java.util.Scanner;

public class Variables {

    public static void main(String[] arg) {


        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        System.out.print("Dime tu nombre: ");
        String nombre = sc.next();
        System.out.println("\n");

        System.out.println("¡Hola " + nombre + "!");
        sc.close();

    }


}
