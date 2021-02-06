package company_x;

import java.util.Scanner;

public class SalesReport {

    public static void main(String arg[]){

        int salesCountBase = 5;

        System.out.println("Inserte el numero de ventas realizadas en la semana: ");
        Scanner scanner = new Scanner(System.in);
        int salesWeek = scanner.nextInt();
        scanner.close();

        if (salesWeek >= salesCountBase) {

            System.out.println("Felicidades! has cumplido con las ventas semanales");

        } else {

            int salesMissing = salesCountBase - salesWeek;
            System.out.println("No tienes el mumero de ventas esperadas, le faltaron " + salesMissing + " ventas");

        }

    }
}
