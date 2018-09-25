import java.lang.reflect.Array;
import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        //  System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`
    int [] randomArray = {1, 1, 34, 11, 52, 61, 1, 34, 123, 123, 4};



        System.out.println(unique(randomArray));


    }

    public static String unique (int [] array) {
        int [] unique = {array[0]};

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < unique.length; j++) {
                if (array[i] == unique[j]) {j = unique.length;}
                else if (j == unique.length-1) {
                    unique = addNumber(unique, array[i]);}
                }
        }
        return Arrays.toString(toString(unique));
    }

    public static String [] toString (int [] array) {
        String [] s = new String[array.length];
        for (int i = 0; i < array.length; i++){
            s[i] = String.valueOf(array[i]);
        }
        return s;
    }



    public static int [] addNumber (int [] array, int number){
            int [] newArray = new int[array.length + 1];
            System.arraycopy(array, 0, newArray, 0,array.length);
            newArray[array.length] = number;
            return newArray;
        }

}
