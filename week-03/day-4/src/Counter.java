public class Counter {
    public static void main(String[] args) {
        // Write a recursive function that takes one parameter: n and counts down from n.
        count(5);
    }
    public static void count (int n){
        if (n == 0) {
            System.out.println(0);
        }
        else {
            System.out.println(n);
            count(n-1);
        }
    }
}
