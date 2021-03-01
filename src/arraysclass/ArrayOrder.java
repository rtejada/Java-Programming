package arraysclass;
import java.util.Arrays;


public class ArrayOrder {

    public static void main(String[] arg){

        int[] num1 = {70, 80, 3 , 4, 100};
        int[] num2 = {50, 8, 3 , 4, 10};
        int[] num3 = {7, 20, 3 , 4, 100};

        Arrays.sort(num3);
        burbuja(num1);
        quicksort(num2, 0, num2.length-1);

        for (int i=0; i<num3.length; i++){
            System.out.println(num3[i]);
        }
    }

    public static void burbuja (int[] list){
        int count = 0;

        for (boolean order = false; !order;){
            for (int i=0; i<list.length-1; i++){
                if (list[i]>list[i+1]){
                    int aux = list[i];
                    list[i] = list[i+1];
                    list[i+1] = aux;
                    count++;
                }
            }
            if (count == 0){
                order = true;
            }
            count=0;
        }

    }

    public static void quicksort (int lista1[], int izq, int der){
        int i=izq;
        int j=der;
        int pivote=lista1[(i+j)/2];
        do {
            while (lista1[i]<pivote){
                i++;
            }
            while (lista1[j]>pivote){
                j--;
            }
            if (i<=j){
                int aux=lista1[i];
                lista1[i]=lista1[j];
                lista1[j]=aux;
                i++;
                j--;
            }
        }while(i<=j);
        if (izq<j){
            quicksort(lista1, izq, j);
        }
        if (i<der){
            quicksort(lista1, i, der);
        }
    }
}
