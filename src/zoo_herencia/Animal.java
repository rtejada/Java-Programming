package zoo_herencia;

public abstract class Animal {

    protected String colour;
    protected int age;

    public Animal(String colour, int age){
        this.colour = colour;
        this.age = age;
    }

    public  abstract void run(int meters);

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
