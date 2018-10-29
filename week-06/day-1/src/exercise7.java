import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class exercise7 {
    public static void main(String[] args) {
        String s = "sdfsafADFasdfSFsdfSSFSDFsdfdsf";
        List<Character> letters = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            letters.add(s.charAt(i));
        }
        Map<Character, Long> charFrequency = letters.stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charFrequency);
    }
}
