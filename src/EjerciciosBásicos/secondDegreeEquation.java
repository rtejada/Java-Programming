package EjerciciosBásicos;

import java.util.Scanner;

public class secondDegreeEquation {

    public static void main (String[] arg) {

        Scanner sc = new Scanner(System.in);

        System.out.println("********************SECOND DEGREE EQUATION****************");
        System.out.println();

        double result = 0;
        double x1 = 0;
        double x2 = 0;

        System.out.println("Insert number one: ");
        double numOne = sc.nextDouble();

        System.out.println("Insert number two: ");
        double numTwo = sc.nextDouble();

        System.out.println("Insert number three: ");
        double numThree = sc.nextDouble();

        x1 = -numTwo + (Math.sqrt(Math.pow(numTwo,2 )- 4 * numOne * numThree))/2*numOne;

        x2 = (-numTwo - (Math.sqrt(Math.pow(numTwo,2 )- 4 * numOne * numThree)))/2*numOne;


        System.out.println("results are " + x1 +" and "+ x2);


    }

}
