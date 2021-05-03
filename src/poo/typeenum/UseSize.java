package poo.typeenum;

import java.util.Locale;
import java.util.Scanner;

public class UseSize {

    //enum size {SMALL, MEDIUM, LARGE, EXTRA_LARGE}

    enum size {

        SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

        private size(String ab){
            this.ab = ab;
        }

        private String ab;

        public String getAb(){
            return ab;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Get a size: SMALL, MEDIUM, LARGE, EXTRA_LARGE ");

        String newSize = sc.next().toUpperCase();

        size theSize = Enum.valueOf(size.class, newSize);

        System.out.println("Size: " + theSize);
        System.out.println("Ab: " + theSize.getAb());

    }
}
