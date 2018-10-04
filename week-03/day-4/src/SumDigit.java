public class SumDigit {
    public static void main(String[] args) {
        System.out.println(sumD(127));
    }
    public static int sumD(int n) {
        int sum = 0;
        if (n / 10 == 0) {
            return n;
        }
        else {
            return (n % 10) + (sumD(n / 10));
        }
    }
}
