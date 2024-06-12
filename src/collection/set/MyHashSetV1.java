package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * - 해시 알고리즘을 적용한 Set
 * 해시 인덱스의 내부 배열에서만 중복 체크를 해주므로
 * 등록, 검색, 삭제 모두 평균 O(1)로 연산 속도를 크게 개선했다.
 *
 * - 문제점
 * 데이터 값에 니머지 연산을 적용한 해시 인덱스인데
 * 데이터 값이 문자열일 경우 어떻게 적용해야하나?
 */
public class MyHashSetV1 {
    static final int DEFAULT_INITIAL_CAPACITY = 16;  // 기본 배열 크기 상수

    private LinkedList<Integer>[] buckets;

    private int size = 0;                            // 현재 저장된 데이터의 전체 크기
    private int capacity = DEFAULT_INITIAL_CAPACITY; // 배열의 크기

    // 기본 생성자
    public MyHashSetV1() {
        initBuckets();
    }

    // 배열 크기를 지정한 생성자
    public MyHashSetV1(int capacity) {
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

    // 요소 추가 메서드
    public boolean add(int value) {
        // 해시 인덱스를 가져오고
        int hashIndex = hashIndex(value);
        
        // 해시 인덱스의 내부 배열 가져오기
        LinkedList<Integer> bucket = buckets[hashIndex];
        
        // 중복 체크
        if (bucket.contains(value)) {
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    // 해시 인덱스 구하는 메서드
    private int hashIndex(int value){
        return value % capacity; // 나머지 연산
    }
    
    // 해시 인덱스의 내부 배열에 중복이 있는지 검사 메서드
    public boolean contains(int searchValue) {
        // 해시 인덱스를 가져오고
        int hashIndex = hashIndex(searchValue);
        
        // 해시 인덱스의 내부 배열을 가져온 후
        LinkedList<Integer> bucket = buckets[hashIndex];
        
        // 해시 인덱스의 내부 배열에 찾는 값이 있는지 검사
        return bucket.contains(searchValue);
    }

    // 제거 메서드
    public boolean remove(int value) {
        int hashIndex = hashIndex(value);

        // 해시 인덱스의 내부 배열을 가져온 후
        LinkedList<Integer> bucket = buckets[hashIndex];

        // 내부 배열에 해당 값 제거
        /**
         * 주의점
         * 링크드 리스트의 remove()는 2개의 파라미터를 받을 수 있는데
         * 하나는 인덱스, 다른 하나는 값이다.
         * 즉, 값으로 제거하려면 Object형으로 받아야 하므로
         * 여기서는 상수이므로 Integer형으로 받아온 파라미터여야 한다.
         */
        boolean result = bucket.remove(Integer.valueOf(value));

        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
