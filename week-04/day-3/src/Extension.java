import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
    int add(int a, int b) {
        return a + b;
    }

    int maxOfThree(int a, int b, int c) {
        if (a >= b && a >= c)
            return a;
        else if (b >= c) {
            return b;
        }
        else return c;
    }

    double median(List<Integer> pool) {
        Collections.sort(pool);
        if (pool.size() % 2 == 0) {
            return (double)((pool.get(pool.size() / 2 - 1)) + pool.get(pool.size() / 2)) / 2;
        }
        else return pool.get(pool.size() / 2);
    }

    boolean isVowel(char c) {
        return Arrays.asList('a', 'u', 'o', 'e', 'i', 'y', 'A', 'E', 'I', 'O', 'U', 'Y').contains(c);
    }

    String translate(String hungarian) {

        for (int i = 0; i < hungarian.length(); i++) {
            if (isVowel(hungarian.charAt(i))) {
                hungarian = hungarian.substring(0, i) + hungarian.charAt(i) + "v" + hungarian.substring(i);
                i+=2;
            }
        }
        return hungarian;
    }
}