package collection.map.test.cart;

import java.util.Objects;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


    /**
     * Map에서의 키는 Set 구조로 중복을 허용하지 않는다.
     * 객체를 넣은 Map에서 중복 객체인지 비교처리하기 위해
     * 반드시 구현해야 한다!!
     *
     * 이 문제의 의도 핵심!!
     *
     * 여기서는 상품 이름과 가격이 동일할 때 중복으로 판단한다.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
