import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many chickens are in the farm?");
        int c = sc.nextInt();
        System.out.println("How many pigs are in the farm?");
        int p = sc.nextInt();
        int legs = c * 2 + p * 4;
        System.out.println("In the farm there are " + legs + " animal legs. Jesus.");
    }
}
