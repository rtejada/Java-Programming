package poo.employee;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Comparable {

    private String nameEmployee;
    private double salaryEmployee;
    private Date contractRegistration;
    private int Id;
    private static int nextId = 0;

    //interfaz predefinida, ordena el array por empleado

    public int compareTo(Object myObject){
        Employee otherEmployee = (Employee) myObject;
        if (this.salaryEmployee < otherEmployee.salaryEmployee){
            return -1;
        }

        if (this.salaryEmployee > otherEmployee.salaryEmployee){
            return 1;
        }
        return 0;
    }

    public Employee(String name, double salary,  int year, int month, int day){
        nameEmployee = name;
        salaryEmployee = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
        contractRegistration = calendar.getTime();
        ++nextId;
        Id = nextId;

    }

    public Employee(String name){
        this(name, 30000, 2000, 01, 01);

    }


    public String giveName(){
        return nameEmployee + " Id: " + Id;
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
