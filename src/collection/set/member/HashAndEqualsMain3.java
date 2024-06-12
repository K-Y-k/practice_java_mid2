package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain3 {
    public static void main(String[] args) {
        /**
         * hashCode()와 equals() 모두 구현한 경우
         */
        MyHashSetV2 set = new MyHashSetV2(10);

        // 같은 객체지만 각 다른 인스턴스의 참조값으로 생성
        Member m1 = new Member("A");
        Member m2 = new Member("A");

        /**
         * 구현한 hashCode() 기준이 id라서
         * 같은 id인 둘 다 같은 해시 코드가 나옴
         */
        System.out.println("m1.hashCode() = " + m1.hashCode()); // 96
        System.out.println("m2.hashCode() = " + m2.hashCode()); // 96
        System.out.println("m1.equals(m2) = " + m1.equals(m2)); // true


        /**
         * - 중복 값 추가
         * 같은 id라서 같은 해시 코드가 나오고
         * 같은 해시 인덱스인 공간에 접근하고
         *
         * equals()로 재정의한 동등성 기준이 id라서
         * 이 내부 공간의 요소들과 비교하여 같은 id값이 이미 있어 추가되지 않았다.
         */
        set.add(m1);
        set.add(m2);

        // [[], [], [], [], [], [], [Member{id='A'}], [], [], []]
        System.out.println(set);

        // 실제 객체의 참조값 확인법
        System.out.println("ref(m1) = " + System.identityHashCode(m1));
        System.out.println("ref(m2) = " + System.identityHashCode(m2));


        /**
         * - 검색
         * 해시 인덱스의 내부 공간에 요소들이 같은 값인지 비교하고
         * 같은 값이 있어
         * 검색 성공
         */
        MemberNoHashNoEquals searchValue = new MemberNoHashNoEquals("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode()); // 1996181658
        boolean result = set.contains(searchValue);
        System.out.println("result = " + result);


        /**
         * 자바에서 복잡한 연산을 통해 해시 충돌이 나지 않도록 구현했지만
         * 간혹 겹칠 수 있다.
         */
        System.out.println("'Aa'.hashCode() = " + "Aa".hashCode()); // 2112
        System.out.println("'BB'.hashCode() = " + "BB".hashCode()); // 2112
    }
}
