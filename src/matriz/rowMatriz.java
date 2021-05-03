package matriz;

import java.util.Scanner;

public class rowMatriz {


    public static void main(String[] args) {

        int [][] matriz =
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        Scanner sc = new Scanner(System.in);
        System.out.println("insert row to print: ");
        int row = sc.nextInt();

        showFileMatriz(matriz, row);

        }


    public static void showFileMatriz(int [][] matriz, int row) {

        if (row >= 0 && row < matriz.length) {

            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println(matriz[row][j]);

            }

        }
        else {
            System.out.println("Error");
        }
    }


}



