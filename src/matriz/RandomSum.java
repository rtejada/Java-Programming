package matriz;
/*Dada la matriz anterior, realizar la suma de una columna o fila aleatoria
        (tanto la elección de la fila o columna, como de elegir si elegir una
        columna o fila)*/
public class RandomSum {

    public static void main(String[] args) {

        final int ROW = 3;
        final int COLUMN = 3;
        int sumRow = 0;

        int[][] matriz = new int[ROW][COLUMN];

        matriz = createRandomMatriz(matriz, 0, 10);
        printMatriz(matriz);
        sumRow = sumRow(matriz, 0, 10);
        System.out.println("la suma de la fila " + sumRow);

    }

    public static int[][] createRandomMatriz(int[][] matriz, int min, int max) {

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

    public static int generateRandomNumber(int min, int max) {

        return (int) Math.floor(Math.random() * (min - (max + 1)) + (max + 1));

    }

    public static boolean existNumber(int[][] matriz, int randomNumber) {

        boolean exists = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == randomNumber) {
                    exists = true;
                    break;
                }
            }
        }
        return exists;

    }

    public static int sumRow(int[][] matriz, int min, int max) {


        int row = 0;
        int sumRow = 0;

        do {
            row = generateRandomNumber(min, max);
            for (int j = 0; j < matriz.length; j++) {
                sumRow += matriz[row][j];

            }

        } while (row < matriz.length);

        return sumRow;
    }

    public static void printMatriz(int[][] matriz){

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {

                System.out.print(matriz[i][j] + " ");
            }

            System.out.println(" ");
        }

    }
}
