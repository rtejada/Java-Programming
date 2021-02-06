package zoo_herencia;

import java.util.ArrayList;
import java.util.List;

public class Zoo_polimorfimo {

    public static void main (String arg[]){

        Animal cat = new Cat("marron", 5);
        Animal dog = new Dog("blanco", 7);

        //List<Animal> animals = new ArrayList<Animal>();
        //animals.add(dog);
        //animals.add(cat);
        //animals.get(0).run(50);


        System.out.println("Carateristicas del gato: ");
        cat.setColour("gris");

        System.out.println("Color: " + cat.getColour());
        System.out.println("Edad: " + cat.getAge());
        ((Cat)cat).maullar();
        cat.run(300);

        System.out.println("Datos del pero: ");
        System.out.println("Color: " + dog.getColour());
        System.out.println("Edad: " + dog.getAge());
        ((Dog)dog).ladrar();
        dog.run(300);

    }
}
