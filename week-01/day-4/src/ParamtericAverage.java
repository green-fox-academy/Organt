import java.util.Scanner;

public class ParamtericAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

        Scanner sc = new Scanner(System.in);
        System.out.println("give me a number,bro");
        int x = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= x; i++) {
            int a = sc.nextInt();
            sum += a;
        }
        double avg = (double) sum / x;
        System.out.println("Sum: " + sum + ", Average: " + avg);


    }
}
