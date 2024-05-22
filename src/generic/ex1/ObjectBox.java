package generic.ex1;

/**
 * 담는 클래스만 다르기에 최상위 부모인 Objcet 클래스의 다형성을 활용한 방법
 */
public class ObjectBox {
    private Object value;

    public Object get() {
        return value;
    }

    public void set(Object value) {
        this.value = value;
    }
}
