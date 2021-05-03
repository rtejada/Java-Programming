package poo.employeewithheredity;

public class TestFinal {

    public static void main(String[] args){

        Employee employee1 = new Employee("Ana");
        Employee employee2 = new Employee("Raul");
        Employee employee3 = new Employee("Antonio");
        employee1.changeSection("Develop");
        employee2.changeSection("People");



        System.out.println(employee1.giveData() + "\n" + employee2.giveData() + "\n" + employee3.giveData());
        System.out.println(Employee.giveIdNext());

    }
}


