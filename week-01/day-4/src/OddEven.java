import sun.plugin2.message.JavaScriptCallMessage;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a whole number, brother.");
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("Yo, your number is even");
        } else {
                System.out.println("Yo, your number is odd.");
            }


    }
}
