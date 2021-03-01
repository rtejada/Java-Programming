package EjerciciosBásicos;

import java.util.Scanner;

public class PerfectNUmber {

    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        System.out.println("Input one number: ");
        int number = sc.nextInt();
        int perfectNumber = 0;

        for (int i=1; i<number; i++){
            if (number % i == 0){
                 perfectNumber += i;
            }
        }

        if (perfectNumber == number){
            System.out.println("The Number " + number + " is perfect");

        } else {
            System.out.println("The Number " + number + " isn't perfect");
        }

    }
}
