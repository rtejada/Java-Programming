package poo.abstractclass;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee extends Person{

    private double salaryEmployee;
    private Date contractRegistration;
    private int Id;
    private static int nextId = 0;



    public Employee(String name, double salary, int year, int month, int day){

        super(name);

        salaryEmployee = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
        contractRegistration = calendar.getTime();
        ++nextId;
        Id = nextId;

    }

    //redefinimos el metodo abstracto de la clase person.
    public String giveDescription(){
        return "This employee has Id equals a " + Id + " with salary " + salaryEmployee;
    }


    public double giveSalary(){
        return salaryEmployee;
    }

    public Date giveContractRegistration(){
        return contractRegistration;
    }

    public void salaryIncrement(double percent){
        double addSalary = salaryEmployee * percent/100;
        salaryEmployee += addSalary;

    }
}
