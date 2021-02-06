package Variables;

import java.util.Scanner;

public class calculoMatematico {

    public static void main(String[] arg){




        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta numero uno: ");
        int numero1 = sc.nextInt();

        System.out.println("Inserta numero dos: ");
        int numero2 = sc.nextInt();


        System.out.println("La suma de los dos numeros insertados es: " + (numero1 + numero2));
        System.out.println("La resta de los dos numeros insertados es: " + (numero1 - numero2));
        System.out.println("La multiplicación de los dos numeros insertados es: " + (numero1 * numero2));

        if (numero2 == 0) {

            System.out.println("El numero " + numero1 + " no se puede dividir entre "+ numero2);

        } else {
            double division = (double) numero1 / numero2;

            System.out.println("La división de los dos numeros insertados es: " + division);

        }
        sc.close();

    }
}
