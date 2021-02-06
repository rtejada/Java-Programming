package student_grades;

import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentGrades {

    static public void main(String arg[]){

        System.out.println("Indica cantidad de notas que insertaras: ");
        Scanner scanner = new Scanner(System.in);

        int numberNotes = scanner.nextInt();

        List<Integer> notes = new ArrayList<Integer>();

        for (int i=0; i<numberNotes; i++) {
            System.out.println("Dime la nota "+ (i+1) +":");
            int note = scanner.nextInt();
            notes.add(note);
        }
        scanner.close();

        int average = 0;

        for (int i=0; i<notes.size(); i++){
            average += notes.get(i);
        }

        average = average/notes.size();

        System.out.println("El promedio del alunmo es: " + average);




    }
}
