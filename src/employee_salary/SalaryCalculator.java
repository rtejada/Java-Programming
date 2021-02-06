package employee_salary;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String arg[]){

        //Obtener el nombre del empleado
        System.out.println("Inserte el nombre del empleado: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        //Obtener la cantidad de horas trabajadas en el mes
        System.out.println("Inserte el numero de horas trabajadas: ");
        double hoursWorks = scanner.nextDouble();

        //Obtener el valor hora del empleado
        System.out.println("Inserte el importe por hora trabajada: ");
        double pyRate = scanner.nextDouble();
        scanner.close();

        //Multiplicar cantidad de horas trabajadas * valor hora

        double monthSalary = hoursWorks * pyRate;

        //Mostrar el salario mensual del empleado

        System.out.println("El salario mensual del empleado " + name + " es de " + monthSalary + "€");
    }


}
