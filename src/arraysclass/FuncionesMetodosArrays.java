package arraysclass;

public class FuncionesMetodosArrays {

    public static void main(String[] arg){

        int lista[] = {1, 8, 7, -8, 10};
        imprimirArray(lista);

        lista = rellenarArrayDesde(10);
        System.out.println("");
        imprimirArray(lista);

    }

    public static void imprimirArray (int[] lista){

        for (int i=0; i<lista.length; i++){
            System.out.println(lista[i]);

        }
    }

    public static int[] rellenarArrayDesde(int a){

        int num[] = new int[10];
        for (int i=0; i<num.length; i++){
            num[i] = a;
            a ++;
        }
        return num;
    }
}
