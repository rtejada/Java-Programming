package matriz;

import java.util.Scanner;

public class DiagonalMatriz {

    public static void main(String[] args) {

        int [][] matriz =
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };

        /*
        00 01 02
        10 12 12
        20 21 22
        */
        System.out.println("Diagonal");
       for (int i = 0; i <matriz.length; i++){
          System.out.println(matriz[i][i]);

       }
        System.out.println("*****************************");

        System.out.println("Invert Diagonal");
        for (int i = 0, j = matriz[0].length - 1; i < matriz.length; i++, j--) {
            System.out.println(matriz[i][j]);

        }




    }
}
