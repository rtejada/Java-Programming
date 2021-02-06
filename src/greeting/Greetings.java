package greeting;

import java.util.Scanner;

public class Greetings {

    public static void main (String arg[]) {

        System.out.println("Ingresa tu nombre: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        //System.out.println("Hola "+ name);
        scanner.close();

        greetUser(name);

    }

    public static void greetUser(String name) {

        System.out.println("Hola "+ name);
    }

}
