import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        System.out.println("Give me a");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("now give me b");
        double b = sc.nextDouble();
        System.out.println("now give me c");
        double c = sc.nextDouble();
        double surface = 2 * ((a * b) + (b * c) + (a * c));
        double volume = a * b * c;
        System.out.println("Surface Area: " + surface);
        System.out.println("Volume: " + volume);
    }
}
