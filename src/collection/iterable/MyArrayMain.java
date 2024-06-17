package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});

        /**
         * Iterator를 사용하여
         * 각 자료구조에 따른 조회하는 코드를 여기서 구현할 필요가 없어진다.
         */
        Iterator<Integer> iterator = myArray.iterator();
        System.out.println("iterator 사용");
        
        while (iterator.hasNext()) {         // 다음 요소가 없을 때까지 반복
            Integer value = iterator.next(); // 다음 요소를 반환
            System.out.println("value = " + value);
        }

        System.out.println();


        /**
         * - Iterable과 향상된 for문
         * Iterable를 상속받아 구현된 객체는
         * 향상된 for문으로 조회가 가능해지는 큰 장점이 있다.
         *
         * 자바는 컴파일 시점에
         * while (iterator.hasNext()) {
         *     Integer value = iterator.next();
         *     System.out.println("value = " + value);
         * } 로 바꿔준 것이다!
         */
        System.out.println("for-each 사용");
        for (int value : myArray) {
            System.out.println("value = " + value);
        }
    }
}
