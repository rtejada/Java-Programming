package EjerciciosBásicos;

import java.util.Scanner;

public class Horas {

    public static void main(String arg[]) {

        final int SEG_HOR = 3600;
        int horas;
        int minutos;
        int segundos;
        int restosegundos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta los Segundos: ");

        int segundosDado = sc.nextInt();
        horas = segundosDado / SEG_HOR;
        restosegundos = segundosDado % SEG_HOR;
        minutos = restosegundos / 60;
        segundos = restosegundos % 60;


        System.out.println("En "+ segundosDado + " segundos, hay " + horas + " hras, " + minutos + " minutos y " + segundos + " seg.");



    }
}
