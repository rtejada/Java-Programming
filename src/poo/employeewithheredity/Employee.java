package poo.employeewithheredity;

public class Employee {

    private final String name; //valor fijo
    private String section;
    private int id;
    private static int idNext = 1; //static quiere decir que la var pertenece a la clase
    //en los mótodos static, pasa lo mismo, este pertenece solo a la clase

    public Employee(String nom){
        name = nom;
        section = "Admin";
        id = idNext;
        idNext++;

    }

    public void changeSection(String section){
        this.section = section;
    }

    public String giveData(){
        return "The name is: " + name + " and the section is " + section + " and Id is " + id;
    }

    public static String giveIdNext(){
        return "The Next id is: "+ idNext;
    }


}
