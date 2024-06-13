package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {
    public static void main(String[] args) {
        /**
         * 두 숫자의 집합이 제공된다.
         * - 집합1: 1,2,3,4,5
         * - 집합2: 3,4,5,6,7
         *
         * 두 지합의 합집합, 교집합, 차집합을 구해라, 출력 순서는 관계없다.
         * - 합집합: 두집합의 합으로 중복은 제거     -> [1,2,3,4,5,6,7]
         * - 교집합: 두집합의 공통 값              -> [3,4,5]
         * - 차집합: 두집합을 뺀 나머지            -> [1,2]
         */
        HashSet<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        HashSet<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        // 합집합
        Set<Integer> union =new HashSet<>();
        union.addAll(set1);
        union.addAll(set2);
        System.out.println("합집합: " + union);


        // 교집합
        Set<Integer> intersection =new HashSet<>(set1);
        intersection.retainAll(set2); // retainAll()은 겹치는 요소만 모두 넣는 메서드
        //  for (int num : set2) {
        //      if (set1.contains(num)) {
        //          intersection.add(num);
        //      }
        //  }
        System.out.println("교집합: " + intersection);
        

        // 차집합
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2); // removeAll()은 겹치는 요소들 모두 제거
        //  for (int num : set2) {
        //    difference.remove(num);
        //  }
        System.out.println("차집합: " +difference);
    }
}
