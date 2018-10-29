import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class exercise2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
//        double avg = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.summingInt(Integer::intValue))
//                / (double) numbers.stream().filter(n -> n % 2 != 0).count();
//        System.out.println(avg);

        double avg = numbers.stream().filter(n -> n % 2 != 0).mapToDouble(Integer::intValue).average().getAsDouble();
        System.out.println(avg);
    }
}
