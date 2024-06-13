package collection.set.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        /**
         * 여러 정수가 입력된다. 여기서 중복 값을 제거하고 값을 출력해라
         * 30, 20, 20, 10, 10이 출력되면 중복을 제거하고 출력하면 된다.
         * 출력 순서는 관계없다.
         */
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new HashSet<>();

        // Arrays.asList(배열)는 배열을 리스트로 만들 수 있다.
        set.addAll(Arrays.asList(inputArr));

        for (int num : set) {
            System.out.println(num);
        }
    }
}
