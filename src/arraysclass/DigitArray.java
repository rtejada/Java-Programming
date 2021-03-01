package arraysclass;

import java.util.Arrays;
import java.util.Scanner;

public class DigitArray {

    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a digit: ");
        int digit = sc.nextInt();

        int[]numbers = digits(digit);
        Arrays.sort(numbers);
        for (int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]);
        }

    }

    public static int[] digits(int num){
        int count = 0;
        final int DIVISOR = 10;
        int value;

        for (int i=num; i>0; i/=DIVISOR){
            count++;
        }

        int[] array = new int[count];
        for (int i=num, j=0; i>0; i/=DIVISOR, j++){
            value = i % DIVISOR;
            array[j] = value;
        }
        return array;

    }
}
