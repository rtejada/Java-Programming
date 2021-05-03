package matriz;

public class EqualsMatriz {


        public static void main(String[] args) {

            boolean value;

            int [][] matriz =
                    {
                            {1, 2, 3},
                            {2, 2, 2},
                            {7, 7, 7}
                    };

            value = compareRowMatriz(matriz, 1);
            if  (value){
                System.out.println("The matriz is equal");
            }
            else {
                System.out.println("Error");
            }

        }


        public static boolean compareRowMatriz(int [][] matriz, int row) {


            if (row >= 0 && row < matriz.length) {

                int firstValue = (matriz[row][0]);


                for (int j = 1; j < matriz.length; j++) {

                    if (firstValue != matriz[row][j]) {
                        return false;
                    }
                }
                return true;


            } else {
                return false;
            }

        }


}
