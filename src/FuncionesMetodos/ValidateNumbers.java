package FuncionesMetodos;

import java.util.Scanner;

public class ValidateNumbers {

    public static void main(String[] arg){

        validateTwoNumbers(20);
        System.out.print(ValidateNumber(0,10));

    }

    public static void validateTwoNumbers(int num) {
        int x = 1;
        int y = 10;

        if (num > x && num<= y){
            System.out.println("The number inserted is between "+ x + " and " + y);
        }else {
            System.out.println("The number insert isn't correct");
        }

    }

    public static int ValidateNumber(int min, int max){

        Scanner sc = new Scanner(System.in);

        if (min > max){
            int aux = min;
            min = max;
            max = aux;
        }
        int num = 0;
        do{
            System.out.print("Insert number: ");
            num = sc.nextInt();

            if (!(num >= min && num <= max)) {
                System.out.println("Insert a number between "+ min + " and " + max);
            }

        }while (!(num >= min && num <= max));

        return num;


    }
}
