package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        /**
         * Object의 기본 hashCode()는 객체의 참조 값을 기반으로 생성
         */
        Object obj1 = new Object();
        Object obj2 = new Object();

        // 같은 객체이지만 다른 인스턴스로 다른 해시 코드가 나온다.
        // obj1.hashCode() = 189568618
        // obj2.hashCode() = 664223387
        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());
        System.out.println();

        // 객체의 기본 toString으로 출력된 참조값이
        // 해시 코드를 Integer.toHexString() 16진수로 변환한 참조값이었던 것이다.
        System.out.println(Integer.toHexString(obj1.hashCode())); // b4c966a
        System.out.println("obj1 = " + obj1);                     // java.lang.Object@b4c966a
        System.out.println();


        /**
         * 각 타입의 해시 코드 확인
         */
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";
        System.out.println("10.hashCode() = " + i.hashCode());       // 10
        System.out.println("'A'.hashCode() = " + strA.hashCode());   // 65

        // 해시 코드 값이 큰데 해시 충돌이 일어나지 않게 하도록
        // 더하기 말고도 다른 연산을 적용한 것이다.
        System.out.println("'AB'.hashCode() = " + strAB.hashCode()); // 2081

        // hashCode는 마이너스 값이 들어올 수 있다.
        System.out.println("-1.hashCode() = " + Integer.valueOf(-1).hashCode());
        System.out.println();


        /**
         * 재정의한 hashCode() 확인
         */
        // 둘은 같을까? : 인스턴스는 다르지만 id가 같은 경우
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        // equals, hashCode를 오버라이딩 하지 않는 경우와 한 경우를 비교
        System.out.println("(member1 == member2) = " + (member1 == member2));          // false, 인스턴스 참조값이 다르므로   (동일성)
        System.out.println("(member1 equals member2) = " + (member1.equals(member2))); // true, 재정의한 기준이 id 기준이므로 (동등성)

        // 재정의한 hashCode()의 기준이 id로 했으므로 동일함
        System.out.println("member1.hashCode() = " + member1.hashCode()); // 104101
        System.out.println("member2.hashCode() = " + member2.hashCode()); // 104101
    }
}
