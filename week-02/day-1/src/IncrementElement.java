public class IncrementElement {
    public static void main(String[] args) {
       // - Create an array variable named `t`
        // with the following content: `[1, 2, 3, 4, 5]`
        //      - Increment the third element
        //    - Print the third element

        int [] t = {1, 2, 3, 4, 5};
        int [] tcopy = new int[t.length];
        System.arraycopy(t, 0, tcopy, 0,t.length);
        t = new int[t.length + 1];

        System.arraycopy(tcopy, 0, t, 0, 2 );
        System.arraycopy(tcopy, 2, t, 3, 3 );

        t[2]=9;

        System.out.println(t[2]);
    }
}
