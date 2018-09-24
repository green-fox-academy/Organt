public class Sum {
    public static void main(String[] args) {
        //  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer

        System.out.println(sum(6));
    }
    public static int sum (int parameter) {
        int sum = 0;
        for (int i = 1; i <= parameter; i++) {
            sum = sum + i;
        }
        return sum;


    }
}
