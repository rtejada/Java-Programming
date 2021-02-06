package zoo_herencia;

public class Dog extends Animal {


    public Dog(String colour, int age){
        super(colour, age);
    }


    public void ladrar(){
        System.out.println("El perro ladra guau guau");
    }

    @Override
    public void run(int meters) {
        int maxMeters = 1000;
        if (meters < maxMeters)
            System.out.println("OK!");
        else
            System.out.println("El perro no tiene suficiente resistencia para correr mas de " + maxMeters);

    }
}
