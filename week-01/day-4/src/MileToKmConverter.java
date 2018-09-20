import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the distance in km?");
        int x = sc.nextInt();
        double conventor = x / 1.6;
        System.out.println("It is " + conventor + " in miles");
    }
}
