import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CAB {
    int numberToGues;
    List<Character> solution;
    String state; //playing/finished
    int counter;

    public CAB() {
        numberToGues = (int) (Math.random() * 9000 + 1000);
        solution = new ArrayList<>(4);
        String number = Integer.toString(numberToGues);
        for (int i = 0; i < number.length(); i++) {
            solution.add(number.charAt(i));
        }
        state = "playing";
        counter = 0;
    }

    public String result(int number) {
        counter++;
        int count = 0;
        String output = "";
        List<Character> guess = new ArrayList<>(4);
        List<Character> tempSolution = new ArrayList<>(solution);
        String s = Integer.toString(number);
        for (int i = 0; i < s.length(); i++) {
            guess.add(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            if (guess.get(i).equals(tempSolution.get(i))) {
                output += "cow ";
                guess.set(i, 'x');
                tempSolution.set(i, 'x');
                count++;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (!guess.get(i).equals('x') && tempSolution.contains(guess.get(i))) {
                output += "bull ";
                tempSolution.set(tempSolution.indexOf(guess.get(i)), 'y');
            }
        }
        if (count == s.length()) {
            state = "finished";
        } else state = "playing";
        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CAB cowsBulls = new CAB();

        while (cowsBulls.state == "playing") {
            System.out.println("Guess a number");
            int number = scanner.nextInt();
            System.out.println(cowsBulls.result(number));
            if (cowsBulls.state == "playing") {
                System.out.println("Guess again!");
            }
        }
        System.out.println("You've won! You guessed the correct number: " + cowsBulls.numberToGues + ", number of guesses: " + cowsBulls.counter);
    }
}
