package CondicionalBucle.Variables;

import java.util.Scanner;

public class NumeroMenor {

    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta el numero 1: ");
        int num1 = sc.nextInt();

        System.out.println("Inserta el numero 2: ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("El numero "+ num1 +" es igual que " + num2);

        } else if (num1> num2) {
            System.out.println("El numero " + num2 + " es menor que " + num1);

        } else {
            System.out.println("El numero " + num1 + " es menor que " + num2);

        }
        sc.close();


    }
}
