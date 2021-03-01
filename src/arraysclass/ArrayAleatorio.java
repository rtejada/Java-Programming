package arraysclass;

public class ArrayAleatorio {

    public static void main(String arg[]) {

        int[] matriz_aleatorio = new int[150];

        for (int i=0; i<matriz_aleatorio.length; i++){

            matriz_aleatorio[i] = (int)Math.round(Math.random()*100);

        }

        for (int numero:matriz_aleatorio){

            System.out.print(numero + " ");
        }

    }
}
