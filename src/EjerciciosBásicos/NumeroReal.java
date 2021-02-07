package EjerciciosBásicos;

import java.util.Locale;
import java.util.Scanner;

public class NumeroReal {

    static public void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        final double IVA = 0.21;

        System.out.println("Inserta un precio sin IVA");

        double precio = sc.nextDouble();
        double iva = precio*IVA/100;
        //double precioconIVA = precio + iva;

        //double precioConIVA = precio + (precio *IVA);
        double precioconIVA = precio * (1 + IVA);


        System.out.print("En precio con IVA es: ");
        System.out.printf("%1.2f", precioconIVA);

    }
}
