package collection.set;

public class MyHashSetV3Main {
    /**
     * 제네릭과 인터페이스를 적용한 HashSet
     * => 제네릭과 인터페이스를 도입하여 타입 안전성을 높이기
     */
    public static void main(String[] args) {
        /**
         * String형 HashSet
         */
        MySet<String> set = new MyHashSetV3<>(10);

        /**
         * 추가
         */
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);

        /**
         * 검색
         */
        String searchValue = "A";
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);


        /**
         * Integer형 HashSet
         */
        MySet<Integer> set2 = new MyHashSetV3<>(10);
    }
}
