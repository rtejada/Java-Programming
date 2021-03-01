package arraysclass;

import java.util.Scanner;

public class IdentityLetter {

    public static void main(String [] arg){

        Scanner sc = new Scanner(System.in);
        System.out.println("insert your ID number: ");
        int idNumber = sc.nextInt();

        System.out.println("Your ID number "+ idNumber +" has the letter: "+ identityLetter(idNumber));

    }

    public static char identityLetter(int idNumber){

        char[] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',	'S', 'Q', 'V', 'H',	'L', 'C', 'K', 'E'};
        char letter = 0;
        final int DIVISOR = 23;
        letter = letters[idNumber % DIVISOR];
        /*
        for (int i=0; i<letters.length; i++){
            if (letters[i] == letters[idNumber % DIVISOR]){
                letter = letters[i];
            }
        }*/
        return letter;
    }
}
