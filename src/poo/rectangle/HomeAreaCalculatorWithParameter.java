package poo.rectangle;

import java.util.Scanner;

public class HomeAreaCalculatorWithParameter {

    private static Scanner scanner = new Scanner(System.in);

    public static  void main(String arg[]){

        Rectangle room1 = getRomm();
        Rectangle room2 = getRomm();

        double totalArea = CalculateTotalArea(room1, room2);
        System.out.println("El area de los dos cuartos es de: " + totalArea);

        double totalPerimeter = CalculateTotalPerimeter(room1);
            System.out.println("El perimetro del cuarto uno es de: " + totalPerimeter);

    }

    public static double CalculateTotalPerimeter(Rectangle room1){

        return room1.calculatePerimeter();

    }


    public static double CalculateTotalArea(Rectangle room1, Rectangle room2){
        return room1.calculateArea() + room2.calculateArea();
    }

    public static Rectangle getRomm(){

        System.out.println("Inserte el largo del cuarto: ");
        double length = scanner.nextDouble();

        System.out.println("Inserte el ancho del cuarto: ");
        double wight = scanner.nextDouble();

        return new Rectangle(length, wight);
    }



}
