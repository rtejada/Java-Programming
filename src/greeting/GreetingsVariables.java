package greeting;

import java.util.Scanner;

public class GreetingsVariables {

    static Scanner scanner;

    public static void main(String arg[]){

        System.out.println("Ingrese su nombre: ");
        scanner = new Scanner(System.in);
        String name = scanner.next();
        scanner.close();

        greetUser(name);
    }

    public static void  greetUser(String nameUser){

        System.out.println("Hola " + nameUser);
        //scanner.nextInt();
    }
}
