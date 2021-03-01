package poo.vehicle_factory;

public class Auto extends Vehicles {

    private String motor;

    public Auto(String description, double speed, double force, String motor ){
        super(description, speed, force);
        this.motor = motor;

    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }





}
