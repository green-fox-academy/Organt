import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number, bro");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i == 1 || i == x) {
                for (int j = 1; j <= x; j++) {
                    System.out.print("%");
                }
                System.out.println();
            }

            else {
                System.out.print("%");
                for (int j = 1; j < x-1 ; j++) {
                    if (j == i-1) {
                        System.out.print("%");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println("%");

                }
            }
    }
}
