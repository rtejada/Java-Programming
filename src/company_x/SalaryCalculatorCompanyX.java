package company_x;

import java.util.Scanner;

public class SalaryCalculatorCompanyX {

    public static void main(String arg[])
    {

        int salaryWeek = 1000;
        int salesWeekBase = 10;
        int bonus = 150;

        System.out.println("Ingrese la cantidad de ventas que realizo en la semana: ");
        Scanner scanner = new Scanner(System.in);
        int salesWeek = scanner.nextInt();
        scanner.close();

        if (salesWeek > salesWeekBase) {

            salaryWeek = salaryWeek + bonus;

        }

        System.out.println("El Salario del empleado es de " + salaryWeek);
    }
}
