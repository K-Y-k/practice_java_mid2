package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

/**
 * 장바구니 추가 - add()
 * - 장바구니에 상품과 수량을 담는다. 상품의 이름과 가격이 같으면 같은 상품이다.
 * - 장바구니에 이름과 가격이 같은 상품을 추가하면 기존에 담긴 상품에 수량만 추가된다.
 * - 장바구니에 이름과 가격이 다른 상품을 추가하면 새로운 상품이 추가된다.
 *
 * 장바구니 제거 - minus()
 * - 장바구니에 담긴 상품의 수량을 줄일 수 있다. 만약 수량이 0보다 작다면 상품이 장바구니에 제거된다.
 */
public class Cart {
    private final Map<Product, Integer> map = new HashMap<>();

    public void add(Product product, int quantity) {
        map.put(product, map.getOrDefault(product, 0) + quantity);
    }

    public void minus(Product product, int quantity) {
        Integer nowQuantity = map.getOrDefault(product, 0);

        if (nowQuantity - quantity > 0) {
            map.put(product, nowQuantity - quantity);
        } else {
            map.remove(product);
        }
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");

        for (Map.Entry<Product, Integer> product : map.entrySet()) {
            System.out.println("상품: " + product.getKey() + " 수량: " + product.getValue());
        }

        System.out.println();
    }
}
