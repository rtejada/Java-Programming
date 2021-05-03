package matriz;

import java.util.Scanner;

public class SecondMatriz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many column has got your matriz: ");
        int column = sc.nextInt();

        final int ROWS = 5;
        int[][] matriz= new int[ROWS][column];

        for (int i=0; i<matriz.length; i++) {

            for (int j= 0; j<matriz[0].length; j++){
                matriz[i][j] = (int)Math.round(Math.random()*10);
            }
        }

        for (int i=0; i<matriz.length; i++){

            for (int j= 0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j] + " ");
            }

            System.out.println(" ");
        }



    }
}
