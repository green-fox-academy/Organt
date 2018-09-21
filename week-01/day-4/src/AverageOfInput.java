import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey, Yo, write a five whole numbers in a row, please.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int sum = a + b + c + d + e;
        double avg = sum / 5.0;
        System.out.println("Sum is " + sum + " and average is " + avg);
    }
}
