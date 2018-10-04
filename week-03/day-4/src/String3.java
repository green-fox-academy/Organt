public class String3 {
    public static void main(String[] args) {
        // Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".

        System.out.println(separate("Hell**o Vojta, how are you?"));
    }
    public static String separate(String s) {
        if (s.length() == 1) {
            return s;
        }
        else {
            return (s.charAt(0) + "*" + separate(s.substring(1)));
        }
    }
}
