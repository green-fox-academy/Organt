import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
    }

    public static ArrayList<String> appendA (List list) {
        ArrayList<String> newList = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            newList.add(list.get(i).toString() + "a");
        }
        return newList;
    }
}

// The output should be: "boa", "anaconda", "koala", "panda", "zebra"