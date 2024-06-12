package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {
    public static void main(String[] args) {
        /**
         * hashCode()만 구현한 경우
         */
        MyHashSetV2 set = new MyHashSetV2(10);

        // 같은 객체지만 각 다른 인스턴스의 참조값으로 생성
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");

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
         * 같은 해시 인덱스인 공간에 접근했다.
         *
         * = 비교 실패
         * 원래 의도는 같은 id라서 중복으로 판별하여 추가되면 안되지만
         * Object의 equals()로 비교하여 서로 다른 인스턴스는 다르게 판별되어
         * 추가되었다.
         */
        set.add(m1);
        set.add(m2);

        // [[], [], [], [], [], [], [MemberOnlyHash{id='A'}, MemberOnlyHash{id='A'}], [], [], []]
        System.out.println(set);

        // 실제 객체의 참조값 확인법
        System.out.println("ref(m1) = " + System.identityHashCode(m1));
        System.out.println("ref(m2) = " + System.identityHashCode(m2));


        /**
         * - 검색
         * 해시 인덱스의 내부 공간에 요소들이 같은 값인지 비교하는 equals()를 구현하지 않아
         * Object의 equals()로 비교하여 서로 다른 인스턴스는 다르게 판별되어
         * 검색 실패
         */
        MemberNoHashNoEquals searchValue = new MemberNoHashNoEquals("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode()); // 1996181658
        boolean result = set.contains(searchValue);
        System.out.println("result = " + result);
    }
}
