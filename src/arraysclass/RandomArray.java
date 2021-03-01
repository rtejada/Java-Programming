package arraysclass;

public class RandomArray {

    static final int NUMBER_COUNT = 15;
    static final int MAX_VALUE = 800;

    public static void main(String[] arg) {

        int[] numbers = getNumbers();
        showNumbers(numbers);
    }

    public static void showNumbers(int[] numbers){

        System.out.print("The numbers generate are: [");
        for (int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.print("]");
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
