import java.lang.reflect.Array;
import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        //  System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`
    int [] randomArray = {1, 11, 34, 11, 52, 61, 1, 34};

            System.out.print(unique(randomArray)[3]);


    }

    public static int [] unique (int [] array) {
        int [] unique = {array[0]};

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < unique.length; j++) {
                if (array[i] == unique[j]) {j = unique.length;}
                else if (i == j+1) {
                    unique = addNumber(unique, array[i]);}
                }
        }
        return unique;
    }




    public static int [] addNumber (int [] array, int number){
            int [] newArray = new int[array.length + 1];
            System.arraycopy(array, 0, newArray, 0,array.length);
            newArray[array.length] = number;
            return newArray;
        }

}
