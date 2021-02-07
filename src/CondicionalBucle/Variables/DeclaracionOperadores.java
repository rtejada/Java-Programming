package CondicionalBucle.Variables;


public class DeclaracionOperadores {

    public static void main(String arg[]) {

        /* constante - valor fijo */
        final double apulgadas = 2.54;

        //variable
        double cm = 6;

        double resultado = cm / apulgadas;

        System.out.println("En " + cm + " cm hay " + resultado + " pulgadas");

        int a, b, c;
        a = 5;
        b = 4;
        c = a * b;
        System.out.println(c);

    }
}
