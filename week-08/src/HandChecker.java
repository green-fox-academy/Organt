import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HandChecker {

    public String higherRank(String hand) {
        Hand firstHand = new Hand(hand.substring(7, 21));
        Hand secondHand = new Hand(hand.substring(29));
        if (firstHand.isFullhouse() && !secondHand.isFullhouse()) return "Black wins! - (Full house)";
        else if (!firstHand.isFullhouse() && secondHand.isFullhouse()) return "White wins! - (Full house)";
        else if (firstHand.isFullhouse() && secondHand.isFullhouse()) {
            for (int i = 0; i < 5; i++) {
                if (firstHand.sortedListValue().get(i) > secondHand.sortedListValue().get(i)) {
                    if (firstHand.sortedListValue().get(i) > 10) {
                        return "Black wins! - (Full house)";
                    } else return "Black wins! - (Full house)";
                } else if (firstHand.sortedListValue().get(i) < secondHand.sortedListValue().get(i)) {
                    if (secondHand.sortedListValue().get(i) > 10) {
                        return "White wins! - (Full house)";
                    }
                    return "White wins! - (Full house)";
                }
            }
            return "Tie";
        }
        return higherValue(firstHand, secondHand, "High card");

    }

    public static String higherValue(Hand firstHand, Hand secondHand, String reason) {
        for (int i = 0; i < 5; i++) {
            if (firstHand.sortedListValue().get(i) > secondHand.sortedListValue().get(i)) {
                if (firstHand.sortedListValue().get(i) > 10) {
                    return "Black wins! - (" + reason + ": " + toString(firstHand.sortedListValue().get(i)) + ")";
                } else return "Black wins! - (" + reason + ": " + firstHand.sortedListValue().get(i) + ")";
            } else if (firstHand.sortedListValue().get(i) < secondHand.sortedListValue().get(i)) {
                if (secondHand.sortedListValue().get(i) > 10) {
                    return "White wins! - (" + reason + ": " + toString(secondHand.sortedListValue().get(i)) + ")";
                }
                return "White wins! - (" + reason + ": " + secondHand.sortedListValue().get(i) + ")";
            }
        }
        return "Tie";
    }

    public static String toString(int number) {
        if (number == 11) return "Jack";
        else if (number == 12) return "Queen";
        else if (number == 13) return "King";
        else if (number == 14) return "Ace";
        return null;
    }
//
//    public static void main(String[] args) {
//        Hand hand = new Hand("2H 3D 5S 9C KD");
//        List<Integer> list = hand.sortedListValue();
//        for (int i = 0; i < 5; i++) {
//            System.out.println(list.get(i));
//        }
//    }
}
