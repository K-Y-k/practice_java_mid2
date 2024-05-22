package generic.ex1;

/**
 * Integer의 값을 설정하고 가져오는 클래스
 */
public class IntegerBox {
    private Integer value;

    public void set(Integer value) {
        this.value = value;
    }

    public Integer get() {
        return value;
    }
}
