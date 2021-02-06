package person;

import java.util.Scanner;

public class ViewDetailPerson {

    public static void main(String arg[]){

        System.out.println("Introduce tu nombre: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Introduce tu Coeficiente Intelectual: ");
        Integer ci = scanner.nextInt();

        System.out.println("Introduce tu edad: ");
        Integer age = scanner.nextInt();

        Person data = new Person(name, ci, age);
        data.calculateAge(age);

        System.out.println("En cuantas empresas has trabajado: ");

        Integer numbersCompanies = scanner.nextInt();

        for (int i=0; i<numbersCompanies; i++) {

            System.out.println("Inserta el nombre de la empresa: ");
            String nameCompany = scanner.next();
            data.addCompany(nameCompany);
        }

        scanner.close();

        data.listCompanies();

        System.out.println(data);

    }
}
