package FuncionesMetodos;

public class funcionesMetodos {

    public static void main(String[] arg){

        int resul = sumNum(5,20);
        System.out.println("Resultado "+ resul);
        sumNumeros();


    }
    //función devuelve valor
    public static int sumNum(int num1, int num2){

        int resultado = num1 + num2;
        return resultado;
    }

    //metodo no devuelve valor
    public static void sumNumeros(){
        int num1=8;
        int num2=8;
        int resultadoSuma = num1 + num2;
        System.out.println(resultadoSuma);
    }

}
