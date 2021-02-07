package CondicionalBucle;

import javax.swing.*;

public class Factorial {

    public static void main(String arg[]) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
        long factorial = 1L;

        for (int i=num; i>0; i--){
            factorial *= i;

        }

        System.out.println("El factorial de "+num+" es: " + factorial);

    }
}
