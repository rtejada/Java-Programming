package arraysclass;

import java.util.Arrays;

public class MajorMinorArray {

    public static void main(String[] arg){

        int[] numbers = {10, 5, 0, 20, 107};
        System.out.println("v1");
        majorMinor(numbers);
        System.out.println("V2");
        majorMinorTwo(numbers);

    }

    public static void majorMinor(int[] numbers) {
        int major = numbers[0];
        int minor = numbers[0];

        for (int i=1; i<numbers.length; i++){
            if (numbers[i] > major){
                major = numbers[i];
            }else if (numbers[i] < minor){
                minor = numbers[i];
            }
        }

        System.out.println("The number major is: " + major);
        System.out.println("The number minor is: " + minor);

    }

    public static void majorMinorTwo(int[] numbers) {
        Arrays.sort(numbers);
        int major = numbers[numbers.length-1];
        int minor = numbers[0];

        System.out.println("The number major is: " + major);
        System.out.println("The number minor is: " + minor);
    }
}

