package validation;

import java.util.Scanner;

public class WorkHoursValidation {

    public static void main(String arg[]){

        int maxHours = 40;
        int minHours = 1;

        System.out.println("Ingrese la cantodad de Horas trabajadas: ");
        Scanner scanner = new Scanner(System.in);
        int workedHours = scanner.nextInt();

        while (workedHours > maxHours || workedHours < minHours) {

            System.out.println("La cantidad de horas no es valida. El Maximo de horas es de " + maxHours +
                    ". Por favor ingrese nuevamente la cantidad de horas: ");
            workedHours = scanner.nextInt();
        }

        scanner.close();

        System.out.println("Usted ha ingresado " + workedHours + "horas");
    }

}
