package arraysclass;
import java.util.Arrays;

public class CompareArrays {

    public static void main(String[] arg){

        int[] firstArray = {3, 5, 6, 7, 10};
        int[] secondArray = {3, 5, 6, 7, 110};

        compArray(firstArray, secondArray);

    }

    public static void compArray(int[] firstArray, int[] secondArray){

        if (Arrays.equals(firstArray, secondArray))
            System.out.println("Are equals");
        else
            System.out.println("Aren't equals");


    }
}
