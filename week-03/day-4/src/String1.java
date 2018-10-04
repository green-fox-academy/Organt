public class String1 {
    public static void main(String[] args) {
        // Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.
        System.out.println(xToY("dfgxxxxxxxxxxxxxxxxsgsdgrdgyyyyyyyyyyZXXXXXXxxxxxx vcxxxxxxxxxx"));

    }
    public static String xToY(String s) {
        if (!s.contains("x")) {
            return s;
        }
        else {
            return xToY(s.substring(0,s.indexOf('x')) + "y" + s.substring(s.indexOf('x')+1));
        }
    }
}
