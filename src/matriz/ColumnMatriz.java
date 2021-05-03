package matriz;

import java.util.Scanner;

public class ColumnMatriz {

    public static void main(String[] args) {

        int [][] matriz =
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        Scanner sc = new Scanner(System.in);
        System.out.println("insert column to print: ");
        int column = sc.nextInt();

        showColumnMatriz(matriz, column);

    }

    public static void showColumnMatriz(int [][] matriz, int column) {

        if (column >= 0 && column < matriz[0].length) {

            for (int i = 0; i < matriz.length; i++) {
                System.out.println(matriz[i][column]);

            }
        }
        else {
            System.out.println("Error");
        }
    }

}
