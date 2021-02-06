package car;

import java.util.ArrayList;
import java.util.List;


public class CarBrans {

    static public void main(String arg[]){

        List<String> list = new ArrayList<>();
        list.add("Dacia");
        list.add("Seat");
        list.add("BMW");
        list.add("Mercedes");

        for (int i=0; i<list.size(); i++){

            System.out.println(list.get(i));
        }



    }

}
