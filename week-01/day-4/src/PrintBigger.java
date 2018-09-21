import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me two numbers, brother, and I'll show you magic!");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > y) {
            System.out.println(x);
        } else if (x == y) {
            System.out.println("Yo, they are the same!");
        } else {
            System.out.println(y);
        }
    }
}
