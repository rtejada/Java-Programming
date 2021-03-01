package EjerciciosBásicos;

import java.util.Scanner;

public class CalculateSalary {

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);


        double salaryBase = 0;
        int option = 0;

        do {

            System.out.println("\n");
            System.out.println("****WHAT'S YOUR JOB***");
            System.out.println("1. SALESMAN");
            System.out.println("2. MANAGER");
            System.out.println("3. JANITOR");
            System.out.println("0. GOUT OUT");

            System.out.print("Insert option: ");
            option = sc.nextInt();

            if (option < 0 || option > 3){

                System.out.println("You must insert a number between 1 and 3");

            } else {
                System.out.println("What are your salary base: ");
                salaryBase = sc.nextDouble();

                switch (option) {

                    case 1:
                        salaryBase += 500;
                        break;
                    case 2:
                        salaryBase += 1000;
                        break;
                    case 3:
                        salaryBase += 100;

                }
            }
            System.out.println("Your Salary base with increase is: " + salaryBase);

        }while (option!=0);

        System.out.println("Thanks for using programming");

    }

}
