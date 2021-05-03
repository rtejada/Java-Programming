package matriz;
/*
Generar una matriz de 3×3 con números aleatorios sin repetirse.
*/

import java.util.Arrays;

public class RandomMatriz {
    public static void main(String[] args) {
        final int ROW = 3;
        final int COLUMN = 3;

        int [][] matriz = new int[ROW][COLUMN];

        matriz = createRandomMatriz(matriz, 0, 10);

        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz.length; j++){
                System.out.print(matriz[i][j] +" ");
            }
            System.out.println(" ");
        }


    }

    public static int [][] createRandomMatriz( int [][] matriz, int min, int max){

        int generateNumber = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {

                generateNumber = generateRandomNumber(min, max);

                while (existNumber(matriz, generateNumber)){
                    generateNumber = generateRandomNumber(min, max);
                }
                matriz[i][j] = generateNumber;

            }
        }

        return matriz;

    }

    public static int generateRandomNumber(int min,int max){

        return (int)Math.floor(Math.random()*(min -(max + 1))+(max + 1));

    }

    public static boolean existNumber(int[][] matriz, int randomNumber){

        boolean exists = false;

        for (int i=0; i<matriz.length; i++){
            for (int j= 0; j<matriz[0].length; j++){
                if (matriz[i][j] == randomNumber){
                   exists = true;
                   break;
                }
            }
        }
        return exists;

    }



}
