package poo.car;

public class Car {
    private int wheels;
    private int length;
    private int width;
    private int engine;
    private int platformWeight;

    private String color;
    private int totalWeight;

    private boolean leatherSeats;
    private boolean climateControl;

    //constructor
    public Car(){
        wheels = 4;
        length = 2000;
        width = 300;
        engine = 1600;
        platformWeight = 500;
    }

    public String tellMeGeneralData(){
        return "The car's platform has got " + wheels + " wheels, it measures " + length/1000 + " meters wide "
                + width + "cm, and the platform weights " + platformWeight + "kg";
    }

    public String getColor() {
        return "Your car's color is: "+color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void configureSeats(String leatherSeat){
        if (leatherSeat.equalsIgnoreCase("si")){
            this.leatherSeats=true;
        }else {
            this.leatherSeats=false;
        }
    }

    public String tellMeSeat(){
        if (leatherSeats){
            return "the car has got leather seat";
        }else {
            return "The car hasn't got leather seat";
        }
    }

    public void configureClimatic(String climate){

        if (climate.equalsIgnoreCase("si")){
            this.climateControl=true;
        }else {
            this.climateControl=false;
        }
    }

    public String tellMeClimate(){

        if (climateControl){
            return "The car has got air conditioner ";
        }else {
            return "the car hasn't got air conditioner ";
        }
    }

    public String tellMeCarWeight(){

        int weightBodywork = 500;
        totalWeight = platformWeight + weightBodywork;

        if (leatherSeats){
            totalWeight += 50;
        }
        if (climateControl){
            totalWeight+=20;
        }
        return "The car's weight is " + totalWeight;
    }



}
