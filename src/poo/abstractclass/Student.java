package poo.abstractclass;

public class Student extends Person{

    private String job;

    public Student(String name, String job){
        super(name);
        this.job = job;
    }

    public String giveDescription(){
        return "This student is studding the " + job + " career";
    }

}
