package Variables;


public class NumerosPares {

    public static void main(String[] arg){


        System.out.println("FOR - Los numeros pares son entre 1 y 10 son: ");

        for (int i=1; i<=10; i++)
            if (i % 2 == 0) {
                System.out.println(i);
            }

        System.out.println("\n");

        System.out.println("otra forma - Los numeros pares son entre 1 y 10 son: ");

        for (int i=2; i<=10; i+=2)
            System.out.println(i);


        System.out.println("\n");

        System.out.println(" WHILE - Los numeros pares son entre 1 y 10 son: ");

        int i = 1;

        while (i <= 10) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
