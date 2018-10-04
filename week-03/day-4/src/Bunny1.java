public class Bunny1 {
    public static void main(String[] args) {
        // We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
        System.out.println(ears(4));
    }
    public static int ears(int n) {
        if (n == 1) {
            return 2;
        }
        else {
            return 2 + ears(n - 1);
        }
    }
}
