import java.util.*;
import java.util.stream.Collectors;

public class Hand {
    List<Card> cards = new ArrayList<>();

    public Hand(String hand) {
        for (int i = 0; i < 5; i++) {
            Card card = new Card();
            if ((hand.substring(3*i,1  + 3 * i)).equals("J")){
                card.value = 11;
            }
            else if ((hand.substring(3*i,1 + 3 * i)).equals("Q")){
                card.value = 12;
            }
            else if ((hand.substring(3*i,1 + 3 * i)).equals("K")){
                card.value = 13;
            }
            else if ((hand.substring(3*i,1 + 3 * i)).equals("A")){
                card.value = 14;
            }
            else {
                card.value = Integer.parseInt(hand.substring(3 * i, 1 + 3 * i));
            }
            card.color = hand.charAt(1 + 3* i);
            cards.add(card);
        }
    }

    public int highestValue(){
        int highest = 0;
        for (int i = 0; i < 5; i++) {
            if (cards.get(i).value > highest){
                highest = cards.get(i).value;
            }
        }
        return highest;
    }

    public  List<Integer> sortedListValue(){
        List<Integer> sortedValues = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            sortedValues.add(cards.get(i).value);
        }
        Collections.sort(sortedValues,Collections.reverseOrder());


//        cards.sort(Comparator.comparing(o -> o.getItem().getValue()));
        return sortedValues;
    }

    public boolean isFullhouse(){
        List<Integer> fullHouse = sortedListValue();
        if(((fullHouse.get(0) == fullHouse.get(1))
            && fullHouse.get(2) == fullHouse.get(3) && fullHouse.get(3) == fullHouse.get(4) ||
                (fullHouse.get(0) == fullHouse.get(1)) &&  fullHouse.get(1) == fullHouse.get(2) &&
                        ( fullHouse.get(3) == fullHouse.get(4)))){
            return true;
        }
        else return false;

    }
}