package poo.abstractclass;

public class TestsMain {
    public static void main(String[] args){

        Person[] thePersons = new Person[2];
        thePersons[0] = new Employee("Luis", 50000, 2009, 2, 25);
        thePersons[1] = new Student("Pepe", "Develop");

        for (Person p: thePersons){
            System.out.println(p.giveName() + ", " + p.giveDescription());
        }

    }
}


