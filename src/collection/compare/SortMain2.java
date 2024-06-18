package collection.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain2 {
    public static void main(String[] args) {
        /**
         * - Comparator 인터페이스
         * 정렬 기준을 바꾸고 싶을 때 사용하는 인터페이스
         * 두 인수를 비교해서 결과 값을 반환하면 된다.
         * - 첫 번째 인수가 더 작으면 음수 ex) -1
         * - 두 값이 같으면 0
         * - 첫 번째 인수가 더 크면 양수   ex) 1
         */
        Integer[] array = {3, 1, 2};
        // [3, 1, 2]
        System.out.println(Arrays.toString(array));


        System.out.println("AscComparator 비교 정렬");
        Arrays.sort(array, new AscComparator());   // 비교자 클래스를 매개 객체로 넣어줄 수 있다.
        // [1, 2, 3]
        System.out.println("AscComparator: " + Arrays.toString(array));
        System.out.println();


        System.out.println("DescComparator 비교 정렬");
        Arrays.sort(array, new DescComparator());
        // [3, 2, 1]
        System.out.println("DescComparator: " + Arrays.toString(array));
        System.out.println();

        // 다른 방식: 반대로 뒤집는 메서드 활용
        Arrays.sort(array, new AscComparator().reversed());
        System.out.println("AscComparator().reversed(): " + Arrays.toString(array));
    }

    /**
     * 오름차순 기준으로 구현한 비교자 클래스
     */
    static class AscComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1=" + o1 + " o2=" + o2);

            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1);
        }
    }
    
    /**
     * 내림차순 기준으로 구현한 비교자 클래스
     */
    static class DescComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1=" + o1 + " o2=" + o2);

            // 마지막 반환 값에 -를 적용하여 반대로 적용
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1) * -1;
        }
    }
}
