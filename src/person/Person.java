package person;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private Integer ci;
    private Integer age;
    private List<String> companies = new ArrayList<>();

    @Override
    public String toString() {
        return "Este es un objeto para la persona: " + this.name;
    }

    public Person(String name, Integer ci, Integer age){

        this.name = name;
        this.ci = ci;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getCi() {
        return ci;
    }

    public void setCi(Integer ci){
        this.ci = ci;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public List<String> getCompanies() {
        return companies;
    }

    public void setCompanies(List<String> company) {
        this.companies = company;
    }


    public void calculateAge(Integer age){

        if (age >= 18 && age <=65){
            System.out.println("Hola "+ name + " Estas en edad de trabajo");

        } else if (age > 65){
            System.out.println("Hola "+ name + "Estas en edad dde retiro");

        } else {
            System.out.println("Hola "+ name + "Eres menor de edad");
        }

    }



    public void addCompany(String company){

        this.companies.add(company);

    }

    public void listCompanies(){

        System.out.println("Las empresas donde has trabajado son: " + String.join(",", this.companies));

    }

}

