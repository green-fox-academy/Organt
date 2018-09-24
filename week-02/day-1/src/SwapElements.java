public class SwapElements {
    public static void main(String[] args) {
        // - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`

        String [] abc = {"first", "second", "third"};
        String [] abcCopy = new String[abc.length];
        System.arraycopy(abc, 0, abcCopy, 0, abc.length);
        abc[0] = abcCopy[abc.length-1];
        abc[abc.length-1] = abcCopy[0];

        System.out.println(abc[0] + " " + abc[2]);
    }
}
