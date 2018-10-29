import java.util.ArrayList;
import java.util.List;

public class exercise10 {
    public static void main(String[] args) {

        List<Fox> foxes = new ArrayList<>();
        Fox fox1 = new Fox("Jonathan", "Artic fox", "white");
        Fox fox2 = new Fox("John", "Red fox", "red");
        Fox fox3 = new Fox("Nathan", "Swift fox", "green");
        Fox fox4 = new Fox("John", "Vulpes", "green");
        Fox fox5 = new Fox("Jonas", "pallida", "green");
        foxes.add(fox1);
        foxes.add(fox2);
        foxes.add(fox3);
        foxes.add(fox4);
        foxes.add(fox5);

//        foxes.stream()
//                .filter(fox -> fox.color.equals("green"))
//                .forEach(fox -> System.out.println(fox.name + " " + fox.type + " " + fox.color));

        foxes.stream()
                .filter(fox -> fox.color.equals("green") && fox.type.equals("pallida"))
                .forEach(fox -> System.out.println(fox.name + " " + fox.type + " " + fox.color));
    }
}
