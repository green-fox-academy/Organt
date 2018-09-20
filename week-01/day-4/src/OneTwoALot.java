import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number");
        int x = sc.nextInt();
        if (x <= 0) {
            System.out.println("Not enough");
        } else if (x == 1 || x == 2) {
            System.out.println(x);
        } else {
            System.out.println("A lot!");
        }
    }
}
