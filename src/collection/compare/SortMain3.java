package collection.compare;

import java.util.Arrays;

public class SortMain3 {
    public static void main(String[] args) {
        /**
         * Comparable와 Comparator 활용 예제
         */
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);


        MyUser[] array = {myUser1, myUser2, myUser3};
        // [MyUser{id='a', age=30}, MyUser{id='b', age=20}, MyUser{id='c', age=30}]
        System.out.println(Arrays.toString(array));
        System.out.println();


        /**
         * - Comparable
         * 직접 만든 객체를 정렬할 때 사용하는 인터페이스
         * 1.직접 만든 객체에 Comparable를 상속받고
         * 2.자기 자신과 인수로 넘어온 객체를 비교해서 반환하는 compareTo를 구현하면 된다.
         */
        System.out.println("Comparable 기본 정렬");
        Arrays.sort(array);
        // [MyUser{id='b', age=20}, MyUser{id='a', age=30}, MyUser{id='c', age=30}]
        System.out.println(Arrays.toString(array));
        System.out.println();

        /**
         * - Comparator
         * Comparator을 상속 받고 compareTo()를 구현한 비교자 클래스를 사용하자
         */
        System.out.println("추가 기준으로 Comparator 정렬");
        Arrays.sort(array,new IdComparator());
        System.out.println(Arrays.toString(array));
        System.out.println();

        System.out.println("IdComparator().reversed() 정렬");
        Arrays.sort(array,new IdComparator().reversed());
        System.out.println(Arrays.toString(array));
    }
}
