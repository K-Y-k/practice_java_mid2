package generic.test.ex2;

/**
 * 하나의 제네릭에 타입 2개가 들어간 예제
 */
public class Pair<T1, T2> {
    private T1 first;
    private T2 second;

    public T1 getFirst() {
        return first;
    }

    public void setFirst(T1 key) {
        this.first = key;
    }

    public T2 getSecond() {
        return second;
    }

    public void setSecond(T2 value) {
        this.second = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + first +
                ", value=" + second +
                '}';
    }
}
