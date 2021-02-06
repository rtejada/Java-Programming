package zoo_herencia;

public class Cat extends Animal {
    public Cat(String colour, int age){
        super(colour, age);
    }

    public void maullar(){
        System.out.println("El Gato maulla miau miau");
    }

    @Override
    public void run(int meters) {
        int MaxMeters = 300;
        if (meters < MaxMeters)
            System.out.println("OK!");
        else
            System.out.println("El gato no tiene suficiente resistencia para correr mas de: " + MaxMeters);

    }
}
