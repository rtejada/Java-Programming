package matriz;

import java.util.Scanner;

public class createMatriz3x3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Definimos un array de 3 filas x 3 columnas
        int [][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Insert a number in the position i: "+ i + ", j: "+j + " ");
                matriz[i][j] = sc.nextInt();
            }
        }

        //Recorremos el array multidimensional

        System.out.println("**************MATRIZ************");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
