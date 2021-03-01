package FuncionesMetodos;

import java.util.Scanner;

public class HighestDigit {

    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a digit: ");
        int digit = sc.nextInt();
        System.out.println("the highest digit is " + digits(digit));
    }

    public static int digits(int num){

        final int DIVISOR = 10;
        int value;
        int highDigit=0;

        for (int i=num; i>0; i/=DIVISOR){
            value = i % DIVISOR;
            if (value > highDigit) {
                highDigit = value;
            }
        }
        return highDigit;

    }
}
