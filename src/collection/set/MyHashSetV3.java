package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * - V2에서 개선된 점
 * 제네릭과 인터페이스를 도입하여 타입 안전성을 높이기
 */
public class MyHashSetV3<E>  implements MySet<E>{
    static final int DEFAULT_INITIAL_CAPACITY = 16;  // 기본 배열 크기 상수

    /**
     * 제네릭 E로 변경
     */
    private LinkedList<E>[] buckets;

    private int size = 0;                            // 현재 저장된 데이터의 전체 크기
    private int capacity = DEFAULT_INITIAL_CAPACITY; // 배열의 크기

    // 기본 생성자
    public MyHashSetV3() {
        initBuckets();
    }

    // 배열 크기를 지정한 생성자
    public MyHashSetV3(int capacity) {
        // 배열 크기 변경
        this.capacity = capacity;

        initBuckets();
    }

    // 외부/내부 배열 생성 메서드
    private void initBuckets() {
        // 외부 배열을 생성
        buckets = new LinkedList[capacity];

        // 내부 배열을 생성
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    /**
     * 전달 받은 값 타입도 E로 변경
     */

    // 요소 추가 메서드
    public boolean add(E value) {
        // 해시 인덱스를 가져오고
        int hashIndex = hashIndex(value);
        
        // 해시 인덱스의 내부 배열 가져오기
        LinkedList<E> bucket = buckets[hashIndex];
        
        // 중복 체크
        if (bucket.contains(value)) {
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    // 해시 인덱스 구하는 메서드
    private int hashIndex(E value){
        /**
         * Object의 hashCode()를 호출하여
         * 해당 자식 객체로 오버라이드한 hashCode()를 호출한다.
         * 음수가 나올 수 있어 절댓값을 씌움 (배열 인덱스는 음수가 없기에)
         */
        return Math.abs(value.hashCode()) % capacity; // 나머지 연산
    }

    // 해시 인덱스의 내부 배열에 중복이 있는지 검사 메서드
    public boolean contains(E searchValue) {
        // 해시 인덱스를 가져오고 O(1)
        int hashIndex = hashIndex(searchValue);
        
        // 해시 인덱스의 내부 배열을 가져온 후 O(1)
        LinkedList<E> bucket = buckets[hashIndex];
        
        // 해시 인덱스의 내부 배열에 찾는 값이 있는지 검사
        // 최악의 경우는 O(N)이지만
        // 보통 충돌이 많이 일어나지는 않아 같은 공간에 저장되는 요소가 적어 평균 O(1)
        return bucket.contains(searchValue);

        /**
         * - equals()도 재정의 해야하는 이유
         * bucket.contains()에서
         * 내부 루프를 조회하면서 비교할 객체와 내부 요소의 객체가 동등한지 비교할 때 사용되기 때문이다!
         * ex) for (Object object : bucket) {
         *      if (object.equals(searchValue)) {
         *          return true;
         *      }
         *    }
         */
    }

    // 제거 메서드
    public boolean remove(E value) {
        int hashIndex = hashIndex(value);

        // 해시 인덱스의 내부 배열을 가져온 후
        LinkedList<E> bucket = buckets[hashIndex];

        // 내부 배열에 해당 값 제거
        // - 주의점
        // 링크드 리스트의 remove()는 2개의 파라미터를 받을 수 있는데
        // 하나는 인덱스, 다른 하나는 값이다.
        // 즉, 값으로 제거하려면 Object형으로 받아야 하므로
        // 여기서는 상수이므로 Integer형으로 받아온 파라미터여야 한다.
        boolean result = bucket.remove(value);

        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "MyHashSetV3{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
