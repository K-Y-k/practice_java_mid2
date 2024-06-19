package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortMain {
    /**
     * 컬렉션 정렬과 관련된 유틸리티
     */
    public static void main(String[] args) {
        /**
         * - 특정 구현체가 아닌 부모 인터페이스로 받는 이유
         * 특정 구현체만의 기능도 사용할 때는 특정 구현체로 받지만
         * 그런 경우가 아니라면 부모 인터페이스로 받아야
         * 추후에 다른 구현체로 변경할 때 편해진다.
         *
         * 하지만 저런 경우가 많지는 않아 큰 차이는 아니다.
         */
        // 리스트의 기능만 사용하므로 List로 받음
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        /**
         * 컬렉션 요소의 최대값과 최소값
         */
        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        System.out.println("max = " + max);
        System.out.println("min = " + min);


        /**
         * 컬렉션 요소를 랜덤으로 섞기
         */
        System.out.println("list = " + list);
        Collections.shuffle(list);
        System.out.println("shuffle list = " + list);


        /**
         * 컬렉션 요소 정렬 (단, 각 컬렉션의 정렬 메서드 사용을 권장)
         */
        Collections.sort(list);
        System.out.println("sort list = " + list);


        /**
         * 컬렉션 요소 정렬 뒤집기 (단, 각 컬렉션의 메서드 사용을 권장)
         */
        Collections.reverse(list);
        System.out.println("reverse list = " + list);
    }
}
