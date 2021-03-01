package poo.car;

public class UseCar {

    public static void main(String[] args){

        Car renault = new Car(); //instance a class
        renault.setColor("white");


        System.out.println(renault.getColor());
        System.out.println(renault.tellMeGeneralData());

        renault.setLeatherSeats(true);
        if (renault.isLeatherSeats()){
            System.out.println("The car have leather seats");
        }else {
            System.out.println("The car hasn't got leather seats");
        }


    }
}
