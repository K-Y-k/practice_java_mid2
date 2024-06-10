package collection.set;

import java.util.Arrays;

public class HashStart3 {
    public static void main(String[] args) {
        /**
         * 배열의 인덱스와 요소의 값을 통일 시켜
         * 한번에 접근하도록 개선했다. O(1)
         *
         * 단점 : 입력한 값의 범위만큼 큰 배열을 사용해야 한다.
         *       메모리 낭비 문제
         */
        Integer[] inputArray = new Integer[100]; // 배열의 크기를 입력 값의 최대값까지 더 늘려줘야한다.

        // 입력: 1,2,5,8,14,99
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;

        // [null, 1, 2, null, null, 5, null, null, 8, null, ... 14, ... , 99]
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 99;
        Integer result = inputArray[searchValue]; // inputArray[99]로 한번에 접근 O(1)
        System.out.println("result = " + result);
    }
}
