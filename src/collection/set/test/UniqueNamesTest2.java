package collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        /**
         * 여러 정수가 입력된다. 여기서 중복 값을 제거하고 값을 출력해라
         * 30, 20, 20, 10, 10이 출력되면 중복을 제거하고 출력하면 된다.
         * 단, 입력 순서대로 출력해라. = LinkedHashSet
         */
        Integer[] inputArr = {30, 20, 20, 10, 10};

        /**
         * - Arrays.asList()와 List.of()
         * 둘 다 배열을 리스트로 변환하는 것
         * 
         * Arrays.asList()은 자바 1.2부터 존재
         * List.of()는 자바 9이상으로 List.of()를 권장함
         */
        // List.of(배열)는 배열을 리스트로 만들 수 있다.
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));

        for (int num : set) {
            System.out.println(num);
        }
    }
}
