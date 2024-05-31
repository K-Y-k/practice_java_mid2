package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    /**
     * 다른 자료구조를 사용하지 않을 것 같으면
     * 생성자에서 주입 받지 않고 이렇게 선언하는게 났다.
     */
    private final List<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");

        /**
         * 하나의 루프에서 모두 적용이 가능하지만
         * 유지보수 관점에서 떨어진다.
         *
         * 한번 더 루프를 돌아서 효율성이 떨어져 보이지만
         * 현대 컴퓨터 환경에서는 이정도 루프는 사소한 차이이므로
         * 몇십만 같은 수 많은 연산이 아니라면
         * 분리하는 것이 더 유지보수 관점에서 좋다.
         * 이렇게 분리하면 추가로 메서드로 만들어서 재활용성을 높일 수도 있다.
         */
        // 정보 출력 부분
        printInformation();

        // 계산 부분
        System.out.println("전체 가격 합:" + calculateTotalPrice());
    }


    private void printInformation() {
        for (Item item : itemList) {
            System.out.println("상품명:" + item.getName() + ", 합계:" + item.getTotalPrice());
        }
    }

    private int calculateTotalPrice() {
        int total = 0;
        for (Item item : itemList) {
            total += item.getTotalPrice();
        }
        return total;
    }
}
