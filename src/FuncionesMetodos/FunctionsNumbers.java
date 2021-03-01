package FuncionesMetodos;

import java.util.ArrayList;
import java.util.List;

public class FunctionsNumbers {

    public static void main (String[] arg){
        int a = 5;
        int b = 8;
        System.out.println("The number random between "+ a +" and "+b+" is: "+randomNum(a, b));

        System.out.println("");
        List<Integer> pairNum = pairNumbers(2, 19);
        System.out.println(pairNum);

        System.out.println("");
        Pairs(10, 1);

        System.out.println("");
        System.out.println("The number octal is: "+ OctalDecimal(123));

    }

    public static int randomNum(int x, int y){

        int n1 = (int)(Math.random()*(x-y+1)+y);
        return n1;
    }

    public static List<Integer> pairNumbers(int x, int y){

        List<Integer> pairNum = new ArrayList<Integer>();

        for (int i= x; i<=y; i++){
            if (i%2==0){
                pairNum.add(i);
            }
        }
        return pairNum;

    }

    public static void Pairs(int a, int b){

        if (a > b){
            int aux = a;
            a = b;
            b = aux;
        }

        for (int i= a; i<=b; i++){
            if (i%2 == 0){
                System.out.println(i);
            }
        }
    }

    public static int OctalDecimal(int decimal){
        int octal = 0;
        int digit;

        final int DIVISOR = 8;

        for (int i=decimal, j= 0; i>0; i/=DIVISOR, j++) {

            digit = i %DIVISOR;
            octal += digit * Math.pow(10,j);
        }
        return octal;

    }



}
