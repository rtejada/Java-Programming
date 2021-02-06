package zoo_herencia;

public class Zoo {

    public static void main (String arg[]){

        Cat cat = new Cat("marron", 5);
        Dog dog = new Dog("blanco", 7);

        System.out.println("Datos del gato: ");

        cat.setColour("gris");

        System.out.println("Color: " + cat.getColour());
        System.out.println("Edad: " + cat.getAge());
        cat.maullar();
        cat.run(300);

        System.out.println("Datos del pero: ");
        System.out.println("Color: " + dog.getColour());
        System.out.println("Edad: " + dog.getAge());
        dog.ladrar();
        dog.run(300);

    }
}
