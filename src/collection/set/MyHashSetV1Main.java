package collection.set;

public class MyHashSetV1Main {
    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1(10); // 배열 크기 10으로 넣음

        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9);  // 해시 인덱스 중복

        // [[], [1], [2], [], [14], [5], [], [], [8], [99, 9]]
        System.out.println(set);

        // 검색
        int searchValue = 9;
        boolean containsResult = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + containsResult);

        // 삭제
        boolean removeResult = set.remove(searchValue);
        System.out.println("removeResult = " + removeResult);
        // [[], [1], [2], [], [14], [5], [], [], [8], [99]]
        System.out.println(set);
    }
}
