package arraysclass;

public class MajorPerson {

    public static void main(String[] arg){
        String[] names = {"Fernando", "Jaime", "Alberto", "Pepito"};
        int[] ages = {28, 31, 20, 10};
        major(names, ages);

    }

    public static void major(String[] names, int[] ages){

        String name;
        int major = 0;
        int j= 0;

        for (int i=0; i<ages.length; i++){
            if (major < ages[i]){
                major = ages[i];
                j = i;

            }
        }
        name = names[j];

        System.out.println(name + " is major, because has got "+ major + " years");

    }
}
