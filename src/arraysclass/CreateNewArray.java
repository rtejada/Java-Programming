package arraysclass;

import java.util.Scanner;

public class CreateNewArray {

    public static void main(String[] arg){
        int[] num = new int[3];
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<num.length; i++){
            System.out.println("Insert a number in the position: " + i);
            num[i] = sc.nextInt();
        }


        System.out.print("The numbers are: " );
        for (int i = 0; i<num.length; i++ ){
            System.out.print(num[i]+" ");
        }






    }


}
