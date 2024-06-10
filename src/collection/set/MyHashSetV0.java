package collection.set;

import java.util.Arrays;

/**
 * Set이란?
 * - 세트는 유일한 요소들의 컬렉션이다.
 *  - 중복된 요소가 존재하지 않고 순서를 보장하지 않는다.
 *    요소의 유무를 빠르게 확인하도록 최적화되어 있다.
 *  
 *  
 * 간단한 Set 직접 구현해보기
 */
public class MyHashSetV0 {
    private int[] elementData = new int[10]; // 단순함을 위해 배열로 10고정
    private int size = 0;

    // 값 추가 O(n)
    public boolean add(int value) {
        // 요소의 중복 검사 O(n)
        if (contains(value)) { // 중복이 있으면
            return false;      // false
        }

        elementData[size] = value;
        size++;
        return true;
    }


    /**
     * 요소에 중복이 있는지 검사 메서드 (O(n))
     */
    public boolean contains(int value) {
        for (int data : elementData) {
            if (data == value) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData, size)) +
                ", size=" + size +
                '}';
    }
}
