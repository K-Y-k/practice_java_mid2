package collection.set;

import java.util.Arrays;

public class HashStart1 {
    public static void main(String[] args) {
        /**
         * 현재
         * 요소에 중복된 값이 있는지 모든 요소를 조회하기 때문에
         * 성능이 좋지 않다. O(n)
         */
        Integer[] inputArray = new Integer[4];

        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 5;
        inputArray[3] = 8;

        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 8;
        // 8의 값을 찾으려면 4번째의 값 조회까지 4번 반복함 O(n)
        for (Integer inputValue : inputArray) {
            if (inputValue == searchValue) {
                System.out.println(inputValue);
            }
        }
    }
}
