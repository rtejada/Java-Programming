package FuncionesMetodos;

public class NumDigits {

    public static void main(String[] arg){

        digits(123);
    }

    public static void digits(int num){

        final int DIVISOR = 10;

        for (int i=num; i>0; i/=DIVISOR){
            System.out.print(i % DIVISOR + " ");

        }

    }
}
