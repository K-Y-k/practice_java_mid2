package collection.iterable;

import java.util.*;

public class JavaIterableMain {
    /**
     * - 자바는 컬렉션 프레임워크를 사용하는 개발자가
     *   편리하고 일관된 방법으로 자료구조를 순회할 수 있도록,
     *   Iterable 인터페이스를 제공하면서
     *   이미 각 구현체에 맞는 Iterator도 다 구현해두었다.
     *
     * - 단, Map의 경우 키와 값이 묶여있어 Map 자체로 순회할 수는 없고
     *   entrySet(), keySet(), values()를 호출하면 Set 등의 컬렉션으로 반환하기에 이때 순회할 수 있다.
     */
    public static void main(String[] args) {
        /**
         * ArrayList 순회
         */
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        printAll(list.iterator());
        forEach(list);


        /**
         * HashSet 순회
         */
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        printAll(set.iterator());
        forEach(set);
    }


    /**
     * 각 자료구조를 통일된 순회 방식 덕분에
     * 하나의 메서드로 적용하여 재사용성을 극대화할 수 있게 되었다!
     */
    private static void printAll(Iterator<Integer> iterator) {
        System.out.println("iterator = " + iterator.getClass());

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /**
     * 각 컬렉션의 최상위는 Iterable이므로
     * Iterable로 받아서 forEach문 메서드 만들어보기
     */
    private static void forEach(Iterable<Integer> iterable) {
        System.out.println(iterable.getClass() + "forEach로 출력");

        for (Integer i : iterable) {
            System.out.println(i);
        }
        System.out.println();
    }

}
