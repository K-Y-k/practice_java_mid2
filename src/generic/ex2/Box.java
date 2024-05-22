package generic.ex2;

/**
 * 여러가지 객체를 담을 수 있는 클래스
 */
public class Box<T> {
    private T value;

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }
}
