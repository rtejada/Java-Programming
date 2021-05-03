package poo.car;

import javax.swing.*;

public class UseVehicle {

    public static void main(String[] args){
        Car myCar1 = new Car();
        myCar1.setColor("Red");

        Vac myVac1 = new Vac(7, 580);
        myVac1.setColor("White");
        myVac1.configureClimatic("si");
        myVac1.configureSeats("si");

        System.out.println(myCar1.tellMeGeneralData() + " " + myCar1.getColor());
        System.out.println(myVac1.tellMeGeneralData() + " " + myVac1.tellMeDataVac() + " " + myVac1.getColor());




    }
}
