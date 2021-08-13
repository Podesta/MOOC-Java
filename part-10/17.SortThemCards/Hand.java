import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Hand implements Comparable<Hand> {

    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        this.hand.stream().forEach(card -> System.out.println(card));
    }

    public void sort() {
        Collections.sort(this.hand);
    }

    public void sortBySuit() {
        Collections.sort(this.hand, new BySuitInValueOrder());
    }

    // Added to practice iterator
    // Must also add equals() and hashCode() to Card class
    public void remove(Card toRemove) {
        Iterator<Card> ite = this.hand.iterator();

        while (ite.hasNext()) {
            Card tmp = ite.next();
            if (tmp.equals(toRemove)) {
                ite.remove();
            }
        }
    }

    @Override
    public int compareTo(Hand comparedHand) {
        int sumHand = 0;
        int sumCompare = 0;

        //sumHand = this.hand.stream().mapToInt(hand -> hand.getValue()).sum();
        for (Card card : this.hand) {
            sumHand += card.getValue();
        }

        //sumCompare = comparedHand.hand.stream().mapToInt(hand -> hand.getValue()).sum();
        for (Card card : comparedHand.hand) {
            sumCompare += card.getValue();
        }

        return sumHand - sumCompare;
    }

}
