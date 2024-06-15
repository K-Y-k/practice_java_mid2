package collection.map.test.cart;

/**
 * CartMain과 실행 결과를 참고해서 Product, Cart 클래스를 완성하자
 * Cart 클래스는 Map을 통해 상품을 장바구니에 보관한다.
 * -> Map의 Key는 Product가 사용되고 Value는 장바구니에 담은 수량이 사용된다.
 */
public class CartMain {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Product("사과", 1000), 1);
        cart.add(new Product("바나나", 500), 1);
        cart.printAll();

        cart.add(new Product("사과", 1000), 2);
        cart.printAll();

        cart.minus(new Product("사과", 1000), 2);
        cart.printAll();

        cart.minus(new Product("사과", 1000), 2);
        cart.printAll();
    }
}
