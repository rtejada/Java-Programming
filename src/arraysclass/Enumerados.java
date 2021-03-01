package arraysclass;

public class Enumerados {
    public static void main (String[] arg){

        Lenguajes[] lenguajes = Lenguajes.values();

        for(Lenguajes p:lenguajes){
            System.out.println("Para trabajar con "+p + " necesitas tener "+p.getAnios()+ " años de experiencia");
        }


    }
}
