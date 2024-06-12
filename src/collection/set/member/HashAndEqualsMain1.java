package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {
    public static void main(String[] args) {
        /**
         * hashCode()와 equals()를 구현하지 않은 경우
         */
        MyHashSetV2 set = new MyHashSetV2(10);

        // 같은 객체지만 각 다른 인스턴스의 참조값으로 생성
        MemberNoHashNoEquals m1 = new MemberNoHashNoEquals("A");
        MemberNoHashNoEquals m2 = new MemberNoHashNoEquals("A");

        /**
         * Object의 기본 hashCode()와 equals()는
         * 인스턴스 참조값이 기준이라서 같은 객체여도 다르게 적용된다.
         */
        System.out.println("m1.hashCode() = " + m1.hashCode()); // 1922154895
        System.out.println("m2.hashCode() = " + m2.hashCode()); // 960604060
        System.out.println("m1.equals(m2) = " + m1.equals(m2)); // false


        /**
         * - 중복 값 추가
         * 같은 id로 등록했지만
         * 서로 다른 인스턴스로 hashCode가 달라서
         * 각 다른 해시 인덱스인 공간에 저장됨
         */
        set.add(m1);
        set.add(m2);

        // [MemberNoHashNoEquals{id='A'}], [], [], [], [], [MemberNoHashNoEquals{id='A'}], [], [], [], []]
        System.out.println(set);


        /**
         * - 검색
         * 검색할 값이 새로운 인스턴스로 생성되어 해시 코드가 달라서
         * 검색에 실패
         */
        MemberNoHashNoEquals searchValue = new MemberNoHashNoEquals("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode()); // 1996181658
        boolean result = set.contains(searchValue);
        System.out.println("result = " + result);
    }
}
