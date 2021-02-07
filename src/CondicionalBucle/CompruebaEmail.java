package CondicionalBucle;

import javax.swing.*;

public class CompruebaEmail {

    public static void main(String arg[]){

        //boolean arroba = false;
        int arroba = 0;
        boolean punto = false;

        String mail = JOptionPane.showInputDialog("Introduce Email: ");

        for (int i= 0; i<mail.length(); i++) {
            if (mail.charAt(i) == '@') {
                //arroba = true;
                arroba ++;
            }
            if (mail.charAt(i) == '.') {
                punto = true;
            }
        }

        if (arroba == 1 && punto){
            System.out.println("Mail correcto");

        } else {
            System.out.println("Mail incorrecto");
        }


    }
}
