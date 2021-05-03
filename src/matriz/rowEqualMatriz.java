package matriz;

import java.util.Scanner;

public class rowEqualMatriz {

    public static void main(String[] args) {

        int [][] matriz =
                {
                        {1, 2, 3},
                        {2, 2, 2},
                        {7, 7, 7}
                };
        Scanner sc = new Scanner(System.in);
        System.out.println("insert row to print: ");
        
        int row = sc.nextInt();
        
        compareRowMatriz(matriz, row);

    }


    public static void compareRowMatriz(int [][] matriz, int row) {


        if (row >= 0 && row < matriz.length) {

            int value = (matriz[row][0]);
            int count = 1;

            for (int j = 1; j < matriz.length; j++) {

                if (value == matriz[row][j]){
                    count ++;
                }

            }

            if (count == matriz.length){
                System.out.println("los valores son iguales");
            } else {
                System.out.println("los valores no son iguales");
            }


        }
        else {
            System.out.println("Error");
        }


    }

}
