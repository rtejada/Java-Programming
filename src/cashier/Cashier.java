package cashier;

import java.util.Scanner;

public class Cashier {

    public static void main(String arg[]) {

        System.out.println("Inserte la cantidad de productos: ");
        Scanner scanner = new Scanner(System.in);
        int productQuantity = scanner.nextInt();

        double totalPrice = 0;

        for (int i=0; i < productQuantity; i++ ) {

            System.out.println("Inserte el precio del producto. ");
            double price = scanner.nextDouble();
            totalPrice += price;
        }

        scanner.close();

        System.out.println("El precio total es de " +  totalPrice + "€");
    }
}
