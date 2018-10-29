import java.util.ArrayList;
import java.util.Arrays;

public class exercise4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));
        numbers.stream().
                filter(n -> n * n > 20).
                forEach(n -> System.out.println(n));
    }
}
