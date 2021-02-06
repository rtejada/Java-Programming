package string_examples;

public class StringExample {

    public static void main(String arg[]) {

        String name = "Roxana";
        System.out.println("String length: " + name.length());

        String colors = "amarilo, azul, rojo";
        String[] colorsArray = colors.split(",");
        System.out.println("colorsArray segundo elemento: " + colorsArray[1]);

        if (name.equals(colors))
            System.out.println("La variable name es igual a la variable colours");

        else
            System.out.println("La variable name No es igual a la variable colours");

        if (colors.contains("rojo"))
            System.out.println("La variable variable colors contiene el color rojo");


    }
}
