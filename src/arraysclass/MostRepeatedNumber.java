package arraysclass;

public class MostRepeatedNumber {

    public static void main(String[] arg){

        int[] numbers = {10, 20, 10, 5, 8, 15, 15, 10, 15, 5};
        mostRepeat(numbers);

    }
     public static void mostRepeat(int[] numbers){

        int moreRepeated = 0;
        int count = 0;
        int major = 0;

         int numberSearch = 0;
         int numberActual = 0;

        for (int i=0; i<numbers.length; i++){
            numberSearch = numbers[i];
            count = 0;
            for (int j=0; j<numbers.length; j++){
                numberActual = numbers[j];
                if (numberSearch == numberActual){
                    count++;
                }
            }
            if (count >= moreRepeated){
                major = numberSearch;
                moreRepeated = count;
            }
        }

         System.out.println("The number with more repeated is: " + major + " have " + moreRepeated + " repeated");

     }
}
