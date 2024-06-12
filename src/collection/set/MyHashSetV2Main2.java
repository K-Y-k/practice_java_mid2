package collection.set;

import collection.set.member.Member;

public class MyHashSetV2Main2 {
    /**
     * 해시 함수, 해시 코드, 해시 인덱스를 활용한 해시 알고리즘을 적용한
     * HashSet 사용 + HashSet에 직접 만든 객체를 넣어보기
     */
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);

        /**
         * hashCode()와 equals()를 모두 구현한 직접 만든 객체 활용
         */
        Member hi = new Member("hi");
        Member jpa = new Member("JPA");  // 대문자 구분하므로 주의
        Member java = new Member("java");
        Member spring = new Member("spring");


        /**
         * 자바에서는 충돌이 발생하지 않도록 좀 더 복잡한 연산으로 해시 코드를 구한다.
         */
        System.out.println("hi.hashCode() = " + hi.hashCode());
        System.out.println("jpa.hashCode() = " + jpa.hashCode());
        System.out.println("java.hashCode() = " + java.hashCode());
        // 여기서는 음수가 나오는데 MyHashSetV2에서 절대값으로 씌어주었으므로 괜찮다.
        System.out.println("spring.hashCode() = " + spring.hashCode());

        set.add(hi);
        set.add(jpa);
        set.add(java);
        set.add(spring);
        // [[Member{id='hi'}, Member{id='JPA'}], [], [], [], [], [], [Member{id='spring'}], [], [], [Member{id='java'}]]
        System.out.println(set);


        // 검색
        Member searchValue = new Member("JPA");
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);
    }
}
