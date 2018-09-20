import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Yo man, write a number!");
        int x = sc.nextInt();
        for (int i = 1; i <= 10; i++) {

            System.out.println(i + " * "+ x + " = " + i*x );
        }
    }
}
