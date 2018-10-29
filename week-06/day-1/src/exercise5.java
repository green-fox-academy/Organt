import java.util.ArrayList;
import java.util.List;

public class exercise5 {
    public static void main(String[] args) {
        String s = "sdfsafADFasdfSFsdfSSFSDFsdfdsf";
        List<Character> letters = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            letters.add(s.charAt(i));
        }
        letters.stream().
                filter(l -> l.toString().equals(l.toString().toUpperCase())).
                forEach(l -> System.out.print(l));
    }
}
