import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class exercise9 {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd'};
        List<Character> listArray = new ArrayList<>();
        for (char c:
             chars) {
            listArray.add(c);
        }
//        Stream<char[]> stream = Stream.of(chars);
        String string = listArray.stream().
                map(ch -> ch.toString()).
                collect(Collectors.joining());

        System.out.println(string);
    }
}
