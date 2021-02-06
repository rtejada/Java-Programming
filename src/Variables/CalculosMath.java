package Variables;

public class CalculosMath {

    public static void main(String arg[]){


        //Clases propias predefinidas

        //Math - Round (redondeo)
        double raiz = Math.sqrt(9);
        final double PI = Math.PI;

        float num1 = 5.85F;
        int resultado = Math.round(num1);

        double num2 = 5.85;
        //Refundición
        int resultado2 = (int) Math.round(num2);

        double base = 5;
        double exponente = 3;
        int resultado3 =  (int)Math.pow(base, exponente);

        System.out.println(raiz);
        System.out.println(PI);
        System.out.println(resultado);
        System.out.println(resultado2);
        System.out.println(resultado3);
    }
}
