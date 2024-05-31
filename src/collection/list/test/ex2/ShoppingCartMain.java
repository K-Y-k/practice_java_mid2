package collection.list.test.ex2;

public class ShoppingCartMain {
    /**
     * 내부 리스트로 사용된 ShoppingCart 클래스를 활용하여 작동하게 하라
     */
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 3000, 4);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();
    }
}
