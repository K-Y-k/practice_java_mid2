package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> cardList = new ArrayList<>();

    public Deck() {
        initCard();
        shuffle();
    }

    private void initCard() {
        for (int i = 1; i  <14; i++) {
            for (Suit value : Suit.values()) {
                cardList.add(new Card(i, value));
            }
        }
    }

    private void shuffle() {
        Collections.shuffle(cardList);
    }

    public Card drawCard() {
        return cardList.removeFirst();
    }
}
