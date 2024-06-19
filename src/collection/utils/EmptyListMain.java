package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EmptyListMain {
    public static void main(String[] args) {
        /**
         * - 빈 컬렉션을 생성하기
         * 결과를 null로 반환하기 보다는
         * 빈 컬렉션(ex) 빈 리스트)를 반한하는 것이 좋을 때가 있는데 이때 사용한다.
         */

        /**
         * 빈 가변 컬렉션 생성
         */
        List<Integer> mutableList1 = new ArrayList<>();
        List<Integer> mutableList2 = new LinkedList<>();


        /**
         * 빈 불변 컬렉션 생성 2가지 방법
         */
        List<Integer> immutableList1 = Collections.emptyList(); // 방식1 (자바5)
        List<Integer> immutableList2 = List.of();               // 방식2 (자바9) : 간결 + 일관성이 있어, 9이상이면 이 기능 권장

        
        System.out.println("mutableList1 = " + mutableList1.getClass());
        System.out.println("mutableList2 = " + mutableList2.getClass());
        System.out.println("immutableList1 = " + immutableList1.getClass());
        System.out.println("immutableList2 = " + immutableList2.getClass());
    }
}
