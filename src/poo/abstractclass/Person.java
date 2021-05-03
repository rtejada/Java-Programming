package poo.abstractclass;

public abstract class Person {

    private String name;

    public Person(String name){
        this.name = name;
    }

    public String giveName(){
        return name;
    }

    public abstract String giveDescription();

}
