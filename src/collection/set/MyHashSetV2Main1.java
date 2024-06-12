package collection.set;

public class MyHashSetV2Main1 {
    /**
     * 해시 함수, 해시 코드, 해시 인덱스를 활용한 해시 알고리즘을 적용한
     * HashSet 사용
     */
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        
        /**
         * 추가
         */
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("AB");
        set.add("SET"); // 'B'와 중복되는 해시 코드

        // [[], [AB], [], [], [], [A], [B, SET], [C], [D], []]
        System.out.println(set);


        /**
         * 각 해시 코드 확인
         */
        System.out.println("'A'.hashCode() = " + "A".hashCode());     // 65
        System.out.println("'B'.hashCode() = " + "B".hashCode());     // 66
        System.out.println("'AB'.hashCode() = " + "AB".hashCode());   // 2081
        System.out.println("'SET'.hashCode() = " + "SET".hashCode()); // 81986


        /**
         * 검색
         */
        String searchValue = "SET";
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " +  result);
    }
}
