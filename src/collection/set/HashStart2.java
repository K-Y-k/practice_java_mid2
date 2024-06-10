package collection.set;

import java.util.Arrays;

public class HashStart2 {
    public static void main(String[] args) {
        /**
         * 배열의 인덱스와 요소의 값을 통일 시켜
         * 한번에 접근하도록 개선했다. O(1)
         *
         * 단점 : 입력한 값의 범위만큼 큰 배열을 사용해야 한다.
         *       메모리 낭비 문제
         */
        Integer[] inputArray = new Integer[10]; // 배열의 크기를 입력 값의 최대값까지 더 늘려줘야한다.

        // 입력: 1,2,5,8
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;

        // [null, 1, 2, null, null, 5, null, null, 8, null]
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        /**
         * inputArray[8]로 한번에 접근 O(1)
         */
        int searchValue = 8;
        Integer result = inputArray[searchValue];
        System.out.println("result = " + result);
    }
}
