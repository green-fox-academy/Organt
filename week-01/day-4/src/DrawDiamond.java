import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey, yo, give me some number, bro..");
        int x = sc.nextInt();
        double y = x / 2.0;
        String s = "*";
        String space = " ";


        if (x % 2 != 0) {

            for (int j = 1; j <= y +1; j++) {
                for (int k = 1; k <= (y+1-j); k++){
                System.out.print(" ");
                }
                System.out.println(s);
                s += "**";
            }

            for (int j = 1; j <= y; j++) {
                System.out.print(space);
                space += " ";
                for (int k = 1; k <= x -2; k += 1) {
                    System.out.print("*");
                }
                System.out.println();
                x -= 2;
            }

        }

        else {
            for (int j = 1; j <= y ; j++) {
                for (int k = 1; k <= (y-j); k++){
                    System.out.print(" ");
                }
                System.out.println(s);
                s += "**";
            }

            for (int j = 1; j <= y; j++) {
                for (int k = 1; k <= x - 1; k += 1) {
                    System.out.print("*");
                }
                System.out.println();
                System.out.print(space);
                space += " ";
                x -= 2;
            }
        }


    }
}
