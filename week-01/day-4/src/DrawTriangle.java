import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey, Yo, give me some number, bro..");
        int x = sc.nextInt();
        String k = "*";
        for (int i = 1; i <= x; i++) {
            System.out.println(k);
            k += "*";
        }
    }
}
