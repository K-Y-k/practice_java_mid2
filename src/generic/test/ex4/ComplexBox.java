package generic.test.ex4;

import generic.animal.Animal;

/**
 * 제네릭 타입의 클래스와 제네릭 메서드의 명칭이 같게 사용한 예제
 * - 제네릭 타입의 클래스와 제네릭 메서드에 선언된 타입은 전혀 다른 소속이다.
 */
public class ComplexBox<T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    /**
     * 제네릭 클래스 타입과 제네릭 메서드 타입의 명칭이 같아도
     * 메서드가 우선순위가 높기 때문에
     * 서로 다른 타입을 담아서 사용한다.
     * 하지만 명칭이 모호한 것은 좋지 않으므로 다른 명칭으로 사용하자.
     */
    public <T> T printAndReturn(T t) {
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("t.className: " + t.getClass().getName());
        return t;
    }
}
