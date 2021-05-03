package poo.employee;

import java.util.Arrays;

public class UseEmployee {

    public static void main (String[] args){

        Chief chiefRRHH = new Chief("Omar", 55000, 1995, 11, 10);
        chiefRRHH.setIncentive(2570);


        Employee[] myEmployees= new Employee[6];
        myEmployees[0] = new Employee("Roxana", 85000, 1990, 12, 17);
        myEmployees[1] = new Employee("Ana", 95000, 1995, 5, 2);
        myEmployees[2] = new Employee("Maria", 105000, 2002, 3, 15);
        myEmployees[3] = new Employee("Antonio Fernandez");

        myEmployees[4] = chiefRRHH; //Polimorfismo en acción, principio de sustitución
        myEmployees[5] = new Chief("Maria", 95000, 1999, 5, 26); //otra opcion q tamb es correcta
        //casting o refundicion
        Chief chiefFinances = (Chief) myEmployees[5];
        chiefFinances.setIncentive(55000);

        System.out.println(chiefFinances.tomar_decisiones("Dar más días de vacaciones a los empleados"));


        for (Employee e: myEmployees){
            e.salaryIncrement(5);
        }


        Arrays.sort(myEmployees);

        for (Employee e: myEmployees){
            System.out.println("Name: " + e.giveName() + ", Salary: " + e.giveSalary()
                    + ", Date Registration: " + e.giveContractRegistration());
        }


         /*
        for (int i=0; i<3; i++){
            myEmployees[i].salaryIncrement(5);
        }
        for (int i=0; i<3; i++){
            System.out.println("Name: " + myEmployees[i].giveName() + "Salary: " + myEmployees[i].giveSalary()
                    + " Date Registration: " + myEmployees[i].giveContractRegistration());
        }*/

        /*
        Employee employee = new Employee("Roxana", 85000, 1990, 12, 17);
        Employee employeeOne = new Employee("Ana", 95000, 1995, 06, 02);
        Employee employeeTwo = new Employee("Maria", 105000, 2002, 03, 15);

        employee.salaryIncrement(5);
        employeeOne.salaryIncrement(5);
        employeeTwo.salaryIncrement(5);

        System.out.println("Name: "+employee.giveName()+ " Salary: "+ employee.giveSalary() + " Date Registration: " + employee.giveContractRegistration());
        System.out.println("");
        System.out.println("Name: "+employeeOne.giveName()+ " Salary: "+ employeeOne.giveSalary() + " Date Registration: " + employeeOne.giveContractRegistration());
        System.out.println("");
        System.out.println("Name: "+employeeTwo.giveName()+ " Salary: "+ employeeTwo.giveSalary() + " Date Registration: " + employeeTwo.giveContractRegistration());
        */


    }
}
