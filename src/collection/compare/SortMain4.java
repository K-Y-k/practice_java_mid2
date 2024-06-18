package collection.compare;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortMain4 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        /**
         * - 주의점
         * Comparable, Comparator는 순서가 있는 컬렉션에만 사용 가능하다.
         * ex) 배열, 리스트, 트리 등
         */
        List<MyUser> list = new LinkedList<>();
        list.add(myUser1);
        list.add(myUser2);
        list.add(myUser3);

        System.out.println("기본 데이터");
        // [MyUser{id='a', age=30}, MyUser{id='b', age=20}, MyUser{id='c', age=10}]
        System.out.println(list);
        System.out.println();

        System.out.println("Comparable 기본 정렬");
        list.sort(null); // 객체 내부에 구현한 기준 정렬로 사용할 시 null
        // [MyUser{id='c', age=10}, MyUser{id='b', age=20}, MyUser{id='a', age=30}]
        System.out.println(list);
        System.out.println();

        System.out.println("Comparator 정렬");
        // [MyUser{id='a', age=30}, MyUser{id='b', age=20}, MyUser{id='c', age=10}]
        list.sort(new IdComparator()); // 구현했던 IdComparator 비교자 클래스를 넣는다.
        System.out.println(list);


        /**
         * - 같은 기능의 Collections.sort()
         * 같은 기능이지만,
         * 제일 최근 버전으로 나오고
         * 객체지향을 위해 각 컬렉션의 정렬 메서드를 사용하는 것을 권장한다.
         */
        System.out.println("Collections - Comparable 기본 정렬");
        Collections.sort(list);
        // [MyUser{id='c', age=10}, MyUser{id='b', age=20}, MyUser{id='a', age=30}]
        System.out.println(list);
        System.out.println();

        System.out.println("Collections - Comparator 정렬");
        // [MyUser{id='a', age=30}, MyUser{id='b', age=20}, MyUser{id='c', age=10}]
        Collections.sort(list, new IdComparator()); // 구현했던 IdComparator 비교자 클래스를 넣는다.
        System.out.println(list);
    }
}
