package FuncionesMetodos;

import java.util.Scanner;

public class CountLetters {

    public static void main(String[] arg){

        String word;
        boolean value;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a word");
        word =sc.next();
        System.out.println("Insert a boolean");
        value=sc.nextBoolean();

        if (value){
            System.out.print(word + " has " + (countUpperCase(word))+ " letters capital letter");
        } else {
            System.out.print(word + " has " + (countLowerCase(word)) + " letters lower case");
        }

    }

    private static long countUpperCase(String s) {
        return s.codePoints().filter(c-> c>='A' && c<='Z').count();
    }

    private static long countLowerCase(String s) {
        return s.codePoints().filter(c-> c>='a' && c<='z').count();
    }
}
