package CondicionalBucle.Variables;

public class ManipulacionCaracteres {

    public static void main(String arg[]){

        String nombre = "Felipe Juan";
        System.out.println("Mi nombre tiene " + nombre.length() + " letras");
        System.out.println("La primera letra de mi nombre es: " + nombre.charAt(0));

        int ultima_letra = nombre.length();

        System.out.println("La ultima letra de mi nombre es: " + nombre.charAt(ultima_letra-1));

        //Substring
        String frase = "Hoy es un estupendo día para aprender a programar en Java";
        String frase_resumen = frase.substring(0,29) + "irnos a la playa y olvidarnos de todo";

        System.out.println(frase_resumen);

        //Equals
        String alumno1, alumno2;
        alumno1 = "David";
        alumno2 = "david";

        System.out.println(alumno1.equals(alumno2));
        System.out.println(alumno1.equalsIgnoreCase(alumno2));



    }

    }
