import java.util.ArrayList;
import java.util.List;

public class Anagram {

    public static boolean anagramChecker(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }
        else if (s1 != null && s2 != null && s1.length() == s2.length()) {
            List<Character> list1 = new ArrayList<Character>();
            List<Character> list2 = new ArrayList<Character>();
            for (int i = 0; i < s1.length(); i++) {
                list1.add(Character.toLowerCase(s1.charAt(i)));
                list2.add(Character.toLowerCase(s2.charAt(i)));
            }
            for (int i = 0; i < list1.size(); i++) {
                if (list1.contains(list2.get(i))) {
                    list1.remove(list1.indexOf(list2.get(i)));
                    list2.remove(i);
                    i--;
                }
            }
            return (list1.size() == 0);
        } else return false;
    }
}
