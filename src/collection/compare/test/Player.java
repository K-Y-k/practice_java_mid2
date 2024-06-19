package collection.compare.test;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private List<Card> hand = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public void drawCard(Deck deck) {
        hand.add(deck.drawCard());
    }

    private void clear() {
        hand.clear();
    }
    
    public int rankSum() {
        int totalValue = 0;

        for (Card card : hand) {
            totalValue += card.getRank();
        }

        return totalValue;
    }

    public void showHand() {
        hand.sort(null);
        System.out.println(name + "의 카드: " + hand + ", 합계: " + rankSum());
    }

    public String getName() {
        return name;
    }
}
