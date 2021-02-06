package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String arg[]){

        System.out.println("Inserte el numero uno: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();

        System.out.println("Inserte el numero dos: ");
        int number2 = scanner.nextInt();

        scanner.close();

        int sum = number1 + number1;
        int multi = number1 * number2;
        int resta = number1 - number2;

        try {
            int div = number1 / number2;
            System.out.println("El resultado de la division es: "+ div);

        }catch (Exception e){
            System.out.println("El resultado de la division por cero no esta permitido");

        }

        System.out.println("El resultado de la multiplicacion es: "+ multi);
        System.out.println("El resultado de la suma es: "+ sum);
        System.out.println("El resultado de la resta es: "+ resta);





    }
}
