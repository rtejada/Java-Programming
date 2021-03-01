package arraysclass;

public class ArraysBidimensionales {

    public static void main(String[] arg) {

       int[][] array = { {1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15} };
        int[][] matrix = new int[2][3];
        matrix[0][0]=15;
        matrix[0][1]=10;
        matrix[0][2]=5;

        matrix[1][0]=1;
        matrix[1][1]=-15;
        matrix[1][2]=8;

        //System.out.println(matrix[1][1]);

        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                System.out.print(matrix[i][j]+" ");
            }
        }

        for (int i=0; i<array.length;i++){
            for (int j=0; j<array[0].length; j++){
                System.out.print(array[i][j]);
            }
        }
        System.out.println("");
        for (int i=0; i<array.length;i++){
            System.out.println(array[i][0]);
            }

    }
}
