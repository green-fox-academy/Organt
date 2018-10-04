public class String2 {
    public static void main(String[] args) {
        // Given a string, compute recursively a new string where all the 'x' chars have been removed.

        System.out.println(removeX("dafsxxxxxxxxxxxxxxxxsdfs sdf x srew"));

    }
    public static String removeX(String s) {
        if (!s.contains("x")) {
            return s;
        }
        else {
            return removeX(s.substring(0,s.indexOf('x')) + "" + s.substring(s.indexOf('x')+1));
        }
    }
}
