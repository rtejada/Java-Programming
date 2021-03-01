package arraysclass;

public class SumAverageArray {

    static final int NUMBER_COUNT = 5;
    static final int MAX_VALUE = 10;

    public static void main(String[] arg) {

        //int[] numbers = getNumbers();
        int[] num = {3, 5, 6, 7, 10};
        sumAverage(num);

    }
    public static void sumAverage(int[] numbers){
        int sum = 0;
        int count = 0;
        double average = 0;

        for (int i=0; i<numbers.length; i++){
            sum += numbers[i];
            count++;
        }
        average = (double) sum / numbers.length;
        //average = sum / NUMBER_COUNT;
        System.out.println("The sum of the numbers is " + sum);
        System.out.println("The average is: " + average);


    }


    public static int[] getNumbers(){

        int[] numbers = new int[NUMBER_COUNT];

        for (int i=0; i<numbers.length; i++){
            numbers[i] = randomGenerate(MAX_VALUE);
        }

        return numbers;
    }

    public static int randomGenerate(int length){

        return (int) (Math.random()*length);
    }
}
