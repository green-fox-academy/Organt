import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number, bro!");
        int y = sc.nextInt();
        int x = 8;

        while (x != y) {

            if (y > x) {
                System.out.println("The stored number is lower.");
                y = sc.nextInt();

            } else {
                System.out.println("The stored number is higher.");
                y = sc.nextInt();

            }
        }
        System.out.println("You found the number: " + x);
    }
}
