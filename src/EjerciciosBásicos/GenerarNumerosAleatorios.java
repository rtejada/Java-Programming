package EjerciciosBásicos;


public class GenerarNumerosAleatorios {

    public static void main(String arg[]) {

        int max = 10;
        int min = 1;
        int aleatorio;

        //aleatorio = (int) (Math.random() * (max - min + 1) + min);

        for (int i=0; i<10; i++){
            //aleatorio= (int)(Math.random()*10);
            aleatorio = (int) (Math.random() * (max - min + 1) + min);
            System.out.println(aleatorio);
        }
    }
}
