package arraysclass;

public class ConcatenateArrays {

    public static void main(String[] arg){

        String[] arg1={"h","o","l","a"};
        String[] arg2={"m","u","n","d","o"};

        String[] newArray = concatenate(arg1, arg2);
        showArray(newArray);

    }

    public static String[] concatenate(String[] arg1, String[] arg2){

        String[] arg3 = new String[arg1.length + arg2.length];

        int i=0;
        for (i=0; i<arg1.length; i++){
            arg3[i] = arg1[i];
        }

        for (int j=0; j<arg2.length; j++){
            arg3[i] = arg2[j];
            i++;
        }

        return arg3;
    }

    public static void showArray(String[] arg3){

        System.out.println("Your new array is: ");
        for (int i=0; i<arg3.length; i++){
            System.out.println(arg3[i]);

        }
    }
}
