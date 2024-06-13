package collection.set.javaset;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {
        /**
         * 자바가 제공하는 Set 인터페이스의 HashSet, LinkedHashSet, TreeSet
         */
        Set<String> hashSet = new HashSet<>();             // O(1)
        Set<String> linkedHashSet = new LinkedHashSet<>(); // O(1)
        Set<String> treeSet = new TreeSet<>();             // O(log n)

        run(hashSet);         // [A, 1, B, 2, C] -> 입력한 순서를 보장 안함
        run(linkedHashSet);   // [C, B, A, 1, 2] -> 입력한 순서를 보장
        run(treeSet);         // [1, 2, A, B, C] -> 데이터 값을 기준으로 정렬
    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");
        System.out.println("set = " + set);
        System.out.println();

        // iterator() 순서대로 반복하여
        // 요소 차례로 출력해보기
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
    }
}
