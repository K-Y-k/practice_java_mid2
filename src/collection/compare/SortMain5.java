package collection.compare;

import java.util.TreeSet;

public class SortMain5 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        /**
         * Tree 구조의 정렬
         * - 이진 탐색 트리 구조는 데이터를 보관할 때 데이터를 정렬하면서 보관하여
         * - 정렬 기준을 제공하는 것이 필수다.
         * - 따라서 TreeSet, TreeMap은
         *   넣는 객체에 Comparable 구현하거나
         *   또는 Comparator를 구현해서 생성자에 넣어야 한다.
         */
        TreeSet<MyUser> treeSet1 = new TreeSet<>();
        treeSet1.add(myUser1);
        treeSet1.add(myUser2);
        treeSet1.add(myUser3);


        /**
         * - 넣은 객체를 비교 처리하려면
         * 해당 객체는 Comparable을 상속 받고 compareTo()를 구현
         */
        System.out.println("트리 구조에서의 Comparable 기본 정렬");
        // [MyUser{id='c', age=10}, MyUser{id='b', age=20}, MyUser{id='a', age=30}]
        System.out.println(treeSet1);


        /**
         * - 트리에서 내가 지정한 기준으로 정렬하고 싶을 때
         * 생성자 안에 Comparator을 상속 받고 compareTo()를 구현한 비교자 클래스를 넣어준다.
         */
        TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
        treeSet2.add(myUser1);
        treeSet2.add(myUser2);
        treeSet2.add(myUser3);

        System.out.println("트리 구조에서 내가 지정한 기준으로 정렬하고 싶을 때 = Comparator 정렬");
        // [MyUser{id='c', age=10}, MyUser{id='b', age=20}, MyUser{id='a', age=30}]
        System.out.println(treeSet1);
    }
}
