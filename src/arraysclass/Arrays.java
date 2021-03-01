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




    }


}
