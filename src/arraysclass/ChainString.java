package arraysclass;

import java.util.Scanner;

public class ChainString {

    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("Insert a phrase: ");
        String chain = sc.next();
        //char[] phrase = characters(chain);
        //showArray(phrase);
        char[] newPhrase = charsOther(chain);
        showArray(newPhrase);

    }

    public static char[] characters(String character){

        char[] chain = new char[character.length()];
        char word;

        for (int j=0; j<character.length(); j++){
            word = character.charAt(j);
            chain[j] = word;
        }
        return chain;
    }

    public static void showArray(char[] array){

        System.out.println("Your phrase is: ");

        for (int i=0; i<array.length; i++){
            System.out.print(array[i]);
        }


    }

    public static char[] charsOther(String chain){
        char[] characters = chain.toCharArray();
        return characters;
    }

}
