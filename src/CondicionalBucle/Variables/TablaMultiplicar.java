package CondicionalBucle.Variables;

import java.util.Scanner;

public class TablaMultiplicar {

    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta un numero: ");
        int num = sc.nextInt();

        System.out.println("Tabla Multiplicar del numero insertado");


        for (int i=1; i<10; i++){
            System.out.println(num+" * "+ i +" = " + (i*num));

        }

        sc.close();

    }

}
