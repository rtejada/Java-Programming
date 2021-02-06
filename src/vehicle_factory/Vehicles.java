package vehicle_factory;

public abstract class Vehicles {
    protected String description;
    protected double speed;
    protected double force;

    public Vehicles(String description, double speed, double force){
        this.description = description;
        this.speed = speed;
        this.force = force;

    }

    public double getPower(){

        return this.force * this.speed;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getForce() {
        return force;
    }

    public void setForce(double force) {
        this.force = force;
    }
}
