package FuncionesMetodos;

import java.security.SecureRandom;
import java.util.Scanner;

public class RandomPassword {

    public static void main(String[] arg) {

        System.out.println("*************Generate password*************");
        Scanner sc = new Scanner(System.in);
        System.out.print("Tell mi the length: ");
        int length = sc.nextInt();
        System.out.println("Your Password is: " + randomString(length));
    }

        public static String randomString(int length) {

            String characterBank = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
            StringBuilder chain = new StringBuilder();

            for (int x = 0; x < length; x++) {
                int randomIndex = randomInt(0, characterBank.length() - 1);
                char randomString = characterBank.charAt(randomIndex);
                chain.append(randomString);
            }
            return chain.toString();
        }

        public static int randomInt(int min, int max) {

            SecureRandom random = new SecureRandom();

            return random.nextInt(max-min+1)+min;

        }



}
