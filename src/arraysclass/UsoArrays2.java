package arraysclass;

import javax.swing.*;

public class UsoArrays2 {

    public static void main(String arg[]) {

        String [] paises = new String[8];

        for (int i=0; i<8; i++){

            paises[i] = JOptionPane.showInputDialog("Introduce Pais: " + (i+1));
        }


         for (String pais:paises) {

             System.out.println("País " + pais);
            }
    }
}
