package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {
    static final int CAPACITY = 10; // 배열 크기

    /**
     * 해시 충돌 문제 개선
     * - 해시 충돌을 낮은 확률로 발생한다고 인정하고
     *   충돌하는 데이터를 같은 공간에 저장한다.
     *
     * - 배열 안에 배열,리스트 등의 자료구조로 공간을 만들어 저장
     *   즉, 위치로 접근하고나서 이 내부 공간은 모두 비교하여 검색한다.
     *
     * - 즉, 최악의 경우 O(n)이지만 대부분의 평균은 O(1)의 성능이다.
     *
     * - 입력한 데이터 수가 배열의 크기 보다 작을수록 충돌 확률이 낮아진다.
     *   (통계로 입력한 데이터 수가 배열의 크기를 75%를 넘지 않으면 충돌이 낮음)
     */
    public static void main(String[] args) {
        // {1,2,3,5,8,14,99}
        /**
         * LinkedList인 배열로 사용
         * LinkedList를 사용한 이유는 ArrayList는 미리 배열 크기를 확보하기에
         * LinkedList로 데이터 추가 부분이 유용하다.
         */
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        // [null, null, null, null, null, null, null, null, null, null]
        System.out.println("buckets = " + Arrays.toString(buckets));

        // 내부에 LinkedList의 공간을 생성
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }

        // [[], [], [], [], [], [], [], [], [], []]
        System.out.println("buckets = " + Arrays.toString(buckets));

        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);

        /**
         * 해시 인덱스 중복으로 충돌이 일어났지만 같은 공간에 넣음
         */
        add(buckets, 9);  // 해시 인덱스 중복으로 충돌

        // [[], [1], [2], [], [14], [5], [], [], [8], [99, 9]]
        System.out.println("buckets = " + Arrays.toString(buckets));


        /**
         * 검색
         */
        int searchValue = 9;
        boolean contains = search(buckets, searchValue);
        System.out.println("bucket.contains(" + searchValue + ") = " +contains);
    }

    // 나머지 연산을 적용하여 해시 인덱스를 구하는 메서드
    static int hashIndex(int value) {
        return value % CAPACITY; // 저장할 데이터를 배열 크기로 나눈 나머지를 인덱스로 지정한다.
    }

    // 값 추가 메서드
    private static void add(LinkedList<Integer>[] buckets, int value) {
        // 해시 인덱스를 구하고
        int hashIndex = hashIndex(value);

        // 해당 인덱스의 배열을 가져오고 O(1)
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        
        // 중복 체크하여 중복이 없으면 값 추가
        if (!bucket.contains(value)) { // O(n)
            bucket.add(value);
        }
    }

    // 값 검색 메서드
    private static boolean search(LinkedList<Integer>[] buckets, int searchValue) {
        // 해시 인덱스를 구하고
        int hashIndex = hashIndex(searchValue);
        
        // 해당 인덱스의 배열을 가져오고 O(1)
        LinkedList<Integer> bucket = buckets[hashIndex];

        // 해당 배열에 찾는 값이 있는지 모두 조회하며 여부 반환 O(n)
        return bucket.contains(searchValue);
    }
}
