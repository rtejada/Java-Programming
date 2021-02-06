package person;


public class PersonProgram {

    public static void main(String arg[]){
        Person1 dataPerson = new Person1("Juan", "25458787R", 18);
        dataPerson.addCompanyName("X");
        dataPerson.addCompanyName("Y");
        dataPerson.addCompanyName("Z");

        System.out.println("Informe sonre la persona: " + dataPerson.getName());
        dataPerson.showWorkingAge();
        System.out.println("Cantidad de empresas donde ha trabajado: "+ dataPerson.getCompanyListCount());
        dataPerson.showCompanyList();



    }
}
