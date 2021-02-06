package Rectangle_POO;

public class RoomAreaCalculator {

    public static void main(String arg[]){

        Rectangle room1 = new Rectangle(10, 5);
        Rectangle room2 = new Rectangle();
        room2.setLength(5);
        room2.setWight(5);

        double room1Area = room1.calculateArea();
        System.out.println("El area del cuarto 1 es: " + room1Area);

        double room2Area = room2.calculateArea();
        System.out.println("El area del cuarto 2 es: " + room2Area);

        double totalArea = room1Area + room2Area;
        System.out.println("El area de los dos cuartos es: " + totalArea);

    }


}
