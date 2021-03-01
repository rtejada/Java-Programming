package FuncionesMetodos;

import javax.swing.*;

public class FunctionSum {

    public static void main(String[] arg) {

        Integer num = Integer.parseInt(JOptionPane.showInputDialog("Insert a number: "));
        int result = SumNumbers(num);
        System.out.println("The result is: " + result);

    }

    public static int SumNumbers(int n){
        int sum = 0;


        for (int i=1; i<=n; i++){
            sum+=i;
        }
        return sum;
    }
}
