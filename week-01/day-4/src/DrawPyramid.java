import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey, Yo, give me some number, bro..");
        int x = sc.nextInt();
        String k = "*";

        for (int j = 1; j <= x; j++) {
            for (int i =1; i <= (x-j); i++){
                System.out.print(" ");
            }
            System.out.println(k);
            k += "**";
        }

    }
}
