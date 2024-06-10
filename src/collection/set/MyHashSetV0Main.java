package collection.set;

public class MyHashSetV0Main {
    public static void main(String[] args) {
        MyHashSetV0 set = new MyHashSetV0();

        /**
         * 추가하는 과정에서
         * 요소에 중복된 값이 있는지 모든 요소를 조회하기 때문에
         * 성능이 좋지 않다.
         * => 중복 데이터를 찾는 부분이 성능에 발목을 잡고 있다.
         */
        set.add(1); // O(n)
        set.add(2); // O(n)
        set.add(3); // O(n)
        set.add(4); // O(n)
        set.add(5); // O(n)
        System.out.println(set);

        boolean result = set.add(4); // 중복 데이터 저장
        System.out.println("중복 데이터 저장 결과 = " + result);
        System.out.println(set);

        System.out.println("set.contains(3) = " + set.contains(3));  // O(n)
        System.out.println("set.contains(99) = " + set.contains(99)); // O(n)
    }
}
