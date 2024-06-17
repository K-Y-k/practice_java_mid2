package collection.iterable;

import java.util.Iterator;

public class MyArray implements Iterable<Integer> {
    private int[] numbers;

    public MyArray(int[] numbers) {
        this.numbers = numbers;
    }

    /**
     * - 순회 방식을 재정의
     * 내가 만든 MyArrayIterator로 참조했다.
     */
    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(numbers);
    }
}
