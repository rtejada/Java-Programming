package poo.employee;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {


    public Employee(String name, double salary,  int year, int month, int day){
        nameEmployee = name;
        salaryEmployee = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
        contractRegistration = calendar.getTime();

    }

    private String nameEmployee;
    private double salaryEmployee;
    private Date contractRegistration;


    public String giveName(){
        return nameEmployee;
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
