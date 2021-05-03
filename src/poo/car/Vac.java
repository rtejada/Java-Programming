package poo.car;

public class Vac extends Car{

    private int loadCapacity;
    private int extraSeats;

    public Vac(int extraSeats, int loadCapacity){

        super(); //llama al constructor de la class padre
        this.loadCapacity = loadCapacity;
        this.extraSeats = extraSeats;
    }

    public String tellMeDataVac(){
        return "The load capacity is: " + loadCapacity + " and tha extra seats is: "+ extraSeats;
    }

}
