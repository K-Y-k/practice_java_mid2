package collection.compare.test;

public class CardGameMain {
    public static void main(String[] args) {
        /**
         * 카드는 1 ~ 13까지 있다.
         * 각 번호당 다음 4개의 문양이 있다.
         * - 스페이드
         * - 하트
         * - 다이아
         * - 클로버
         * ex) 1(스페이드), 1(하트), 1(다이아), 1(클로버) ... 13(스페이드), 13(하트), 13(다이아), 13(클로버)
         * 따라서 13 * 4 = 52장의 카드가 있다.
         * 52장의 카드가 있는 카드 뭉치를 덱이라고 하고
         * 2명의 플레이어가 게임을 진행한다.
         *
         * 1.덱에 있는 카드를 랜덤하게 섞는다.
         * 2.각 플레이어는 덱에서 카드를 5장씩 뽑는다.
         * 3.각 플레이어는 5장의 카드를 정렬된 순서대로 보여준다. 정렬 기준
         *   - 작은 숫자가 먼저 나온다.
         *   - 같은 숫자의 경우 스페이드,하트,다이아,클로버순으로 정렬하여 스페이드가 가장 먼저 나온다.
         * 4.카드 숫자의 합계가 큰 플레이어가 승리한다.
         *   - 게임을 단순화 하기 위해 숫자만 출력하낟.
         *   - 합계가 같으면 무승부이다.
         */
        Deck deck = new Deck();
        Player player1 = new Player("플레이어1");
        Player player2 = new Player("플레이어2");

        for (int i = 0; i < 5; i++) {
            player1.drawCard(deck);
            player2.drawCard(deck);
        }

        player1.showHand();
        player2.showHand();


        /**
         * 변수를 선언하자마자 메서드로 결과를 넣어서 인지하는 방식 선호하자
         */
        Player winner = getWinner(player1, player2);

        if (winner != null) {
            System.out.println(winner.getName() + " 승리");
        } else {
            System.out.println("무승부");
        }
    }

    private static Player getWinner(Player player1, Player player2) {
        int sum1 = player1.rankSum();
        int sum2 = player2.rankSum();

        if (sum1 > sum2) {
            return player1;
        } else if (sum1 == sum2) {
            return null;
        } else {
            return player2;
        }
    }
}
