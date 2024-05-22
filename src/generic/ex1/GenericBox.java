package generic.ex1;

/**
 * 제네릭을 사용하면
 * 1.코드 재사용과 2.타입 안전성 2가지 모두 해결할 수 있다.
 */
public class GenericBox<T> { // T는 타입 매개변수라고 한다.
    private T value;         // 타입을 미리 결정하지 않는다.

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }
}
