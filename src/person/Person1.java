package person;

import java.util.ArrayList;
import java.util.List;

public class Person1 {

    private String name;
    private String ci;
    private int age;
    private List<String> companyList;

    public Person1(String name, String ci, int age){
        this.name = name;
        this.ci = ci;
        this.age = age;
        this.companyList = new ArrayList<String>();

    }

    public String getName(){
        return name;
    }

    public void showWorkingAge(){
        if (age >= 18 && age <= 65)
            System.out.println("Se encuentra en edad laboral");

        if (age > 65)
            System.out.println("Se encunetra en edad de retiro");

        if (age < 18)
            System.out.println("Es menor de edad");
    }

    public int getCompanyListCount(){
        return this.companyList.size();
    }

    public void showCompanyList() {

        if (getCompanyListCount() > 0)
            System.out.println("Nombre de las empresas en las que has trabajado");

        for (int i = 0; i < companyList.size(); i++) {
            System.out.println(companyList.get(i));
        }
    }

    public void addCompanyName(String companyName){
        companyList.add(companyName);

    }



}
