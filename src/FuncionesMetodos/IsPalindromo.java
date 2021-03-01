package FuncionesMetodos;

import java.util.Scanner;

public class IsPalindromo {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("Escribe una fase: ");
        String frase = sc.next().trim();

        if (palindromo(frase)) {
            System.out.println(frase + " Es palindromo");
        } else {
            System.out.println(frase + " No es palindromo");
        }

    }

    public static boolean palindromo(String word) {

        String palindromo = "";
        boolean correct = false;


        for (int i = word.length() - 1; i >= 0; i--) {
            palindromo += word.charAt(i);

        }

        if (word.equals(palindromo)) {
            correct = true;

        }

        return correct;
    }


    }
