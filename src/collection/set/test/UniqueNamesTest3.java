package collection.set.test;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest3 {
    public static void main(String[] args) {
        /**
         * 여러 정수가 입력된다. 여기서 중복 값을 제거하고 값을 출력해라
         * 30, 20, 20, 10, 10이 출력되면 중복을 제거하고 출력하면 된다.
         * 단, 데이터의 값 크기 순서대로 출력해라. = TreeSet
         */
        // List.of()의 매개 변수를 보면 T...로
        // ...은 나열된 숫자를 배열로 만들어주어
        // 숫자로 나열해도 배열로 전달된다.
        Set<Integer> set = new TreeSet<>(List.of(30, 20, 20, 10, 10));

        for (int num : set) {
            System.out.println(num);
        }
    }
}
