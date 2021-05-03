package matriz;
/*Nos piden crear una matriz de 4×4 de números enteros que inicialmente esta vacía, nos piden hacer un menú con estas opciones:

        Rellenar TODA la matriz de números, debes pedírselo al usuario.
        Suma de una fila que se pedirá al usuario (controlar que elija una correcta)
        Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
        Sumar la diagonal principal (ver ejemplo)
        Sumar la diagonal inversa (ver ejemplo)
        La media de todos los valores de la matriz
        IMPORTANTE: hasta que no se haga la primera opción, el resto de opciones no se deberán de ejecutar, simplemente mostrar un mensaje donde diga que debes rellenar la matriz.*/

import java.util.Scanner;

public class ThirdMatriz {

   static boolean matrixFilled = false;

    public static void main(String[] args) {

        final int ROW = 4;
        final int COLUMN = 4;

        int [][] matriz = new int[4][4];

        int option = 0;
        Scanner sc;
        sc = new Scanner(System.in);

        do {

            printMenuOptions();

            option = Integer.parseInt(sc.nextLine());

            if (option < 0 || option > 6) {

                System.out.println("\n");
                System.out.print("*********** Opción no válida. Vuelva a escoger*************");

            } else if (option != 0) {

                System.out.println("\n");

                switch (option) {

                    case 1:

                        matriz = optionOne(ROW, COLUMN, sc);
                        break;

                    case 2:
                        optionTwo(matriz, sc);
                        break;

                    case 3:
                        optionThree(matriz, sc);
                        break;

                    case 4:
                        optionFour(matriz);
                        break;

                    case 5:
                        optionFive(matriz);
                        break;

                    case 6:
                        optionSix(matriz);
                        break;


                }
            }


        } while (option != 0);
        sc.close();

        System.out.println("Ejecución finalizada");
    }

    private static void optionSix(int[][] matriz) {
        float media;

        media = mediaMatriz(matriz);

        System.out.println("La media de la suma de la matriz es: " + media);

    }

    private static void optionFive(int[][] matriz) {
        int sumReverseDiagonal = 0;

        if (!matrixFilled){

            System.out.println("Para realizar esta operación primero debes ejecutar la opción 1");

        } else {

            sumReverseDiagonal = sumReverseDiagonal(matriz);

            System.out.println("La suma de la diagonal inversa es: " + sumReverseDiagonal);

        }
    }

    private static void optionFour(int[][] matriz) {

        int sumMainDiagonal = 0;

        if (!matrixFilled){

            System.out.println("Para realizar esta operación primero debes ejecutar la opción 1.");

        } else {

            sumMainDiagonal = sumMainDiagonal(matriz);

            System.out.println("La suma de la diagonal principal es: " + sumMainDiagonal);

        }
    }

    private static void optionThree(int[][] matriz, Scanner sc) {
        int sumColumn = 0;
        int column = 0;

        System.out.println("Dime la columna que deseas sumar: ");

        column = Integer.parseInt(sc.nextLine());

        if (column >= 0 && column < matriz[0].length) {

            if (!matrixFilled){

                System.out.println("Para realizar esta operación primero debes ejecutar la opción 1.");

            } else {

                sumColumn = sumColumnMatriz(matriz, column);

                System.out.println("La suma de la columna "+ column +" es: " + sumColumn);
            }

        }else {

            System.out.println("El nro de columnas no existe, inténtalo de nuevo");
        }
    }

    private static void optionTwo(int[][] matriz, Scanner sc) {
        int row = 0;
        int sumRow = 0;

        System.out.println("Dime la fila que quieres sumar: ");
        row = Integer.parseInt(sc.nextLine());

        if (row >= 0 && row < matriz[0].length) {

            if (!matrixFilled){

                System.out.println("Para realizar esta operación primero debes ejecutar la opción 1");

            } else {

                sumRow = sumRowMatriz(matriz, row);

                System.out.println("La suma de la fila "+ row +" es: " + sumRow);
            }

        }else {

            System.out.println("El nro de fila no existe, inténtalo de nuevo");
        }
    }

    private static int[][] optionOne(int ROW, int COLUMN, Scanner sc) {
        int[][] matriz;
        int min = 0;
        int max = 0;

        System.out.println("Valor mínimo de la matriz: ");
        min = Integer.parseInt(sc.nextLine());

        System.out.println("Valor máximo de la matriz: ");
        max = Integer.parseInt(sc.nextLine());

        matriz = createMatriz(ROW, COLUMN, min, max);
        System.out.println(matriz[0][1]);

        System.out.println("** Matriz creada correctamente***");

        for (int i= 0; i<matriz.length; i++){
            for (int j=0; j<matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        matrixFilled = true;
        return matriz;
    }

    private static void printMenuOptions() {
        System.out.println("\n");
        System.out.println("********* MATRIZ *********");

        if (matrixFilled) {
            System.out.println("2. Suma de una fila");
            System.out.println("3. Suma de una columna");
            System.out.println("4. Sumar la diagonal principal");
            System.out.println("5. Sumar la diagonal inversa");
            System.out.println("6. La media de todos los valores de la matriz");
        } else {
            System.out.println("1. Rellenar TODA la matriz ");
        }

        System.out.println("0. Salir del Programa");
        System.out.print("Introduzca una opción válida: ");
    }

    public static int [][] createMatriz(int row, int column, int min, int max){

        int [][] matriz = new int[row][column];

        for (int i = 0; i<matriz.length; i++) {

            for (int j = 0; j<matriz[0].length; j++) {

                matriz[i][j] = generateRandomNumber(min, max);
            }
        }
        return matriz;

    }

    public static int generateRandomNumber(int min,int max){

        return (int)Math.floor(Math.random()*(min -(max + 1))+(max + 1));

    }

    public static int sumRowMatriz(int [][] matriz, int row){

        int sumRow = 0;

            for (int i = 0; i < matriz.length; i++) {
                sumRow += matriz[row][i];
            }

        return sumRow;
    }

    public static int sumColumnMatriz(int [][] matriz, int column){

        int sumColumn = 0;

        for (int j = 0; j < matriz[0].length; j++) {
            sumColumn += matriz[j][column];
        }

        return sumColumn;
    }

    public static int sumMainDiagonal(int [][] matriz){

        int sumMainDiagonal = 0;

        for (int i = 0; i < matriz.length; i++) {
            sumMainDiagonal += matriz[i][i];
        }

        return sumMainDiagonal;
    }

    public static int sumReverseDiagonal(int [][] matriz){

        int sumReverseDiagonal = 0;

        for (int i = 0, j = matriz[0].length - 1; i < matriz.length; i++, j--) {

            sumReverseDiagonal += matriz[i][j];

        }

        return sumReverseDiagonal;
    }

    public static int mediaMatriz(int [][] matriz){

        int suma = 0;
        int count = 0;

        for (int i=0; i<matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {

                suma += matriz[i][j];
                count++;
            }
        }

        return suma / count;

    }
}
