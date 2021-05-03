package poo.employee;

public class Chief extends Employee implements CheifInterfaz{

    private double incentive;

    public Chief(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);

    }


    public String tomar_decisiones(String decision){
        return "Un miembro de la direccion ha tomado la decisión de: " + decision;
    }

    public void setIncentive(double b){
        incentive = b;
    }

    public double giveSalary(){
        double chiefSalary = super.giveSalary();
        return chiefSalary + incentive;
    }


}
