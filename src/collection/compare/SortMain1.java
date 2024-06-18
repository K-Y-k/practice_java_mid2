package collection.compare;

import java.util.Arrays;

public class SortMain1 {
    public static void main(String[] args) {
        /**
         * 자바에서 제공하는 기본 정렬 알고리즘 Arrays.sort()
         * - 기본 데이터 타입의 배열을 정렬할 때는 Dual-Pivot Quicksort 알고리즘을 사용
         * -           객체의 배열을 정렬할 때는 Timsort 알고리즘을 사용
         * => 평균 O(n log n)
         */
        Integer[] array = {3, 1, 2};
        // [3, 1, 2]
        System.out.println(Arrays.toString(array));

        System.out.println("기본 정렬 후");
        Arrays.sort(array);
        // [1, 2, 3]
        System.out.println(Arrays.toString(array));
    }
}
