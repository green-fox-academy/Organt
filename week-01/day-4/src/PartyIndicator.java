import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me number of girls and then number of boys");
        int g = sc.nextInt();
        int b = sc.nextInt();

        if ((g == b) && (g + b >= 20)) {
            System.out.println("The party is excellent!");
        } else if (g == 0) {
            System.out.println("This party sucks!");
        } else if ((g != b) && (g + b >= 20)) {
            System.out.println("Quite cool party!");
        } else if (g + b < 20) {
            System.out.println("Average party..");
        }
    }
}
