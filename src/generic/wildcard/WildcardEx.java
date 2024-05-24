package generic.wildcard;

import generic.animal.Animal;
import generic.animal.Dog;

/**
 * 와일드카드
 * - *, ?와 같이 하나 이상의 문자들을 상징하는 특수 문자를 뜻한다.
 * - 와일드카드를 활용하면 제네릭 타입을 조금 더 편리하게 사용할 수 있다.
 */
public class WildcardEx {
    // 일반 제네릭 메서드
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    // 타입 매개변수를 제한한 제네릭 메서드
    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    // 타입 매개변수를 제한 + 반환까지 적용한 제네릭 메서드
    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }


    /**
     * - 제네릭에 와일드카드를 적용
     * 일반 제네릭 타입처럼 모든 객체가 들어올 수 있는데
     *
     * 와일드카드는 제네릭 타입이나 제네릭 메서드를 정의할 때 사용하는 것이 아니라
     * 이미 타입이 정해진 제네릭 타입을 활용할 때 사용한다.
     *
     * 즉, 와일드카드를 사용한다고 제네릭 메서드가 아닌 일반 메서드이고
     * ?는 모든 타입을 받을 수 있다.
     *
     * - 장점
     * 제네릭은 타입을 결정하는 과정이 포함되는데 이 과정은 복잡하다.
     * 즉, 타입이 결정된 상황이면 더 단순한 와일드카드를 사용한다.
     *
     * - 단점
     * 반환하는 타입이 상속한 부모 객체로 담아진다.
     * 즉, 자식 타입으로 반환하지 못한다. (캐스팅을 해야함)
     * 사용된 타입으로 사용하면서 명확하게 반환하고 싶을 때는 제네릭을 사용하자.
     */
    // 일반 와일드카드 적용
    // 모든 타입을 다 받는다.(extends Object) = 비제한 와일드카드
    static void printWildcardV1(Box<?> box) { // ?가 와일드카드
        System.out.println("? = " + box.get());
    }

    // 와일드카드 + 타입 매개변수 제한 = 상한 와일드카드
    static void printWildcardV2(Box<? extends Animal> box) { // ?가 와일드카드
        Animal animal = box.get(); // 꺼내올 때 상속한 객체로 꺼낸다.
        System.out.println("이름 = " + animal.getName());
    }

    // 상한 와일드카드 + 반환
    // 반환 객체는 T가 아닌 상속한 객체로 지정했다.
    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get(); // 자식 객체를 꺼내올 때도 부모 객체로 담는다.
        System.out.println("이름 = " + animal.getName());
        return animal;
    }

    // 하한 와일드카드 (제네릭에서는 불가능한 방식)
    // 지정된 자신 객체와 상위 부모 객체만 담을 수 있다.
    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
    }
}
