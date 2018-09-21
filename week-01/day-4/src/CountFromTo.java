import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey, yo, bro, give me two fucking numbers!");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x >= y) {
            System.out.println("The second number should be bigger, man");

        } else {
            while (x < y) {
                System.out.println(x);
                x++;
            }
        }
    }
}
