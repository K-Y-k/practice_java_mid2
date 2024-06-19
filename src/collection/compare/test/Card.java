package collection.compare.test;

public class Card implements Comparable<Card>{
    private final int rank;
    private final Suit suit;

    public Card(int number, Suit suit) {
        this.rank = number;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card anotherCard) {
        // 숫자를 먼저 비교하고,
        // 숫자가 같으면 마크를 비교
        if (this.rank != anotherCard.rank) {
            // 숫자 비교는 이미 만들어진 기능으로 사용
            return Integer.compare(this.rank, anotherCard.rank);
        }

        // Enum은 이미 Comparable을 구현해놓아서 바로 적용 가능한 것이다.
        // 기준을 열거한 순서 기준으로 구현해놓았다.
        // final로 구현해놓아서 다시 기준을 재설정할 수 없으므로 순서대로 적어 사용한다.
        // 또는 따로 Comparator로 구현한 클래스를 사용한다.
        return this.suit.compareTo(anotherCard.suit);
    }

    @Override
    public String toString() {
        return rank + "(" + suit.getIcon() + ")";
    }
}
