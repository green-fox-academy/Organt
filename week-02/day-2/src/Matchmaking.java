import java.util.*;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList<String> makingMatches (ArrayList list1, ArrayList list2){
        ArrayList<String> newList = new ArrayList<>();
        for (int i = 0; i < smaller(list1.size(), list2.size()); i++) {
            newList.add(list1.get(i).toString());
            newList.add(list2.get(i).toString());
        }
        return newList;
    }

    public static int smaller (int a , int b){
        int c;
        if (a <= b) c = a;
        else c = b;
        return c;
    }
}