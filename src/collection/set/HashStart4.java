package collection.set;

import java.util.Arrays;

public class HashStart4 {
    static final int CAPACITY = 10; // 배열 크기

    /**
     * - 나머지 연산을 통한 인덱스 접근으로 개선 (해시 인덱스)
     * 저장할 데이터를 배열 크기로 나눈 나머지인 인덱스로 저장한다.
     *
     * 장점
     * 1.입력 값의 범위가 넓어도 실제 모든 값이 들어가지 않기에 배열의 크기를 제한하여 메모리 낭비 문제 해결
     * 2.해시 인덱스를 통해 검색하므로 O(1) 성능
     *
     * 단점
     * 1.중복되는 값으로 해시 충돌 문제
     *   ex) 1 % 10 = 1 과 11 % 10 = 1
     */
    public static void main(String[] args) {
        // {1,2,3,5,8,14,99}
        System.out.println("hashIndex(1) = " + hashIndex(1));
        System.out.println("hashIndex(2) = " + hashIndex(2));
        System.out.println("hashIndex(5) = " + hashIndex(5));
        System.out.println("hashIndex(8) = " + hashIndex(8));
        System.out.println("hashIndex(14) = " + hashIndex(14));
        System.out.println("hashIndex(99) = " + hashIndex(99));

        Integer[] inputArray = new Integer[CAPACITY];

        /**
         * 추가 : 나머지 연산을 통한 해시 인덱스를 구한 후 해당 인덱스에 값을 추가
         */
        add(inputArray, 1);
        add(inputArray, 2);
        add(inputArray, 5);
        add(inputArray, 8);
        add(inputArray, 14);
        add(inputArray, 99);

        // [null, 1, 2, null, 14, 5, null, null, 8, 99]
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        /**
         * 검색 : 나머지 연산을 적용한 해시 인덱스로 접근해야 한다. O(1)
         */
        int searchValue = 14;
        int hashIndex = hashIndex(searchValue);
        Integer result = inputArray[hashIndex];

        System.out.println("searchValue hashIndex = " + hashIndex);
        System.out.println("result = " + result);


        /**
         * 해시 충돌
         */
        add(inputArray, 9);  // 해시 인덱스 중복으로 충돌
        // [null, 1, 2, null, 14, 5, null, null, 8, 9]
        System.out.println("inputArray = " + Arrays.toString(inputArray));

    }


    /**
     * 나머지 연산을 적용하여 해시 인덱스를 구하는 메서드
     */
    static int hashIndex(int value) {
        return value % CAPACITY; // 저장할 데이터를 배열 크기로 나눈 나머지를 인덱스로 지정한다.
    }

    /**
     * 값 추가 메서드
     * 해시 인덱스를 찾고 해당 인덱스에 값 추가
     */
    private static void add(Integer[] inputArray, int value) {
        int hashIndex = hashIndex(value);
        inputArray[hashIndex] = value;
    }
}
