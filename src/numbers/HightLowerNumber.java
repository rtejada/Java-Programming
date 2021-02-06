package numbers;

import java.util.*;

public class HightLowerNumber {

    static List<Integer> numbers = new ArrayList<Integer>();

    public static void main(String arg[]){

        int exit = 0;

        System.out.println("Inserte numero: (Pulse 0 para finalizar) ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        while (value > exit) {
            numbers.add(value);
            System.out.println("Inserte numero: (Pulse 0 para finalizar) ");
            value = scanner.nextInt();

        }
        scanner.close();

        System.out.println("El numero mayor es: " +CalculateGraterNumber());
        System.out.println("El numero menor es: " + CalculateSmallestNumber());

    }

    public static int CalculateSmallestNumber(){

       int smallestNumber = numbers.get(0);

       for (int i=1; i<numbers.size(); i++){

           if (smallestNumber > numbers.get(i))
                   smallestNumber = numbers.get(i);
       }

       return smallestNumber;

    }

    static public int CalculateGraterNumber(){

        int graterNumber = numbers.get(0);

        for (int i=1; i<numbers.size(); i++){

            if (graterNumber < numbers.get(i))
                graterNumber = numbers.get(i);

        }

        return graterNumber;

    }

}
