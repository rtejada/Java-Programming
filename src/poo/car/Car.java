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
        return "The car's platform have " + wheels + " wheels, measures " + length/1000 + " meters wide "
                + width + "cm, and a platform weight the " + platformWeight + "kg";
    }


    public int getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }

    public boolean isLeatherSeats() {
        return leatherSeats;
    }

    public void setLeatherSeats(boolean leatherSeats) {
        this.leatherSeats = leatherSeats;
    }

    public boolean isClimateControl() {
        return climateControl;
    }

    public void setClimateControl(boolean climateControl) {
        this.climateControl = climateControl;
    }

    public String getColor() {
        return "Your car's color is: "+color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getPlatformWeight() {
        return platformWeight;
    }

    public void setPlatformWeight(int weight) {
        this.platformWeight = weight;
    }


}
