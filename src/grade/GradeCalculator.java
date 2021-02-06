package grade;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String arg[]){

        System.out.println("Inserte la nota (1-100): ");

        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        scanner.close();

        if (grade > 90){
            System.out.println("Su calificacion es MB");

        } else if (grade > 80){
            System.out.println("Su calificacion es B");

        }else if (grade > 60) {
            System.out.println("Su calificacion es R");

        }else
            System.out.println("Su calificacion es M");


    }
}
