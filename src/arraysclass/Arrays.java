package arraysclass;

public class Arrays {

    public static void main(String[] arg){
        int num[] = new int[10];

        for (int i=0; i<10; i++){
            num[i] = i;
        }
        int multiplo = 5;

        for (int i=0; i<num.length; i++){
            num[i]=multiplo;
            System.out.println(num[i]);
            multiplo += 5;
        }

        System.out.println("*******************************");

        int[] array = new int[5];

        for (int i=0; i<array.length; i+=2){
            array[i] = i-1;
        }


        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);

        }




    }


}
