package collection.list.javalist;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class JavaListPerformanceTest {
    /**
     * 자바에서 제공하는 각 리스트의 성능 비교
     */
    public static void main(String[] args) {
        int size = 50_000;
        ArrayList<Integer> arrayList = new ArrayList<>();
        /**
         * 자바에서 제공하는 LinkedList는 이중 연결 리스트
         */
        LinkedList<Integer> linkedList = new LinkedList<>();

        /**
         * ArrayList의 배열 요소 이동은
         * 시스템 레벨에서 최적화된 메모리 고속 복사 연산을 사용해서
         * 기존 배열보다 비교적 빠르게 수행한다.
         */
        System.out.println("==ArrayList 데이터 추가==");
        addFirst(new ArrayList<>(), size);  // 데이터 추가 및 밀기:O(n)
        addMid(new ArrayList<>(), size);    // 조회:O(1) + 데이터 추가 및 밀기:O(n)
        addLast(arrayList, size);           // 조회:O(1) + 데이터 추가 및 밀기:O(n)

        /**
         * 이중 연결 리스트는 마지막 노드에 대한 참조를 제공하므로
         * 마지막에 데이터 추가는 O(1)이 된다.
         */
        System.out.println("==LinkedList 데이터 추가==");
        addFirst(new LinkedList<>(), size); // 데이터 추가 및 참조 변경: O(1)
        addMid(new LinkedList<>(), size);   // 조회:O(n) + 데이터 추가 및 참조 변경:O(1)
        addLast(linkedList, size);          // 데이터 추가 및 참조 변경:O(1)!!

        System.out.println();

        int loop = 10000;
        System.out.println("==ArrayList 특정 인덱스의 데이터 조회==");
        getIndex(arrayList, loop, 0);         // 제일 앞에서 조회:O(1)
        getIndex(arrayList, loop, size / 2);  // 중간 위치에서 조회:O(1)
        getIndex(arrayList, loop, size - 1);  // 마지막 위치에서 조회:O(1)

        /**
         * 이중 연결 리스트는 이전 노드로 이동할 수 있기 때문에
         * 역방향으로 조회할 수 있어
         * 인덱스 조회 성능을 최적화할 수 있다.
         * ex) 조회하려는 인덱스의 크기가 전체 크기의 절반이상이면 역방향으로 조회
         */
        System.out.println("==LinkedList 특정 인덱스의 데이터 조회==");
        getIndex(linkedList, loop, 0);        // 제일 앞에서 조회:O(1)
        getIndex(linkedList, loop, size / 2); // 중간 위치에서 조회:O(n)
        getIndex(linkedList, loop, size - 1); // 마지막 위치에서 조회:O(n)

        System.out.println();

        System.out.println("==ArrayList 데이터의 값 조회==");
        search(arrayList, loop, 0);        // 제일 앞의 값 조회:O(1)
        search(arrayList, loop, size / 2); // 중간 위취의 값 조회:O(n)
        search(arrayList, loop, size - 1); // 마지막 위치의 값 조회:O(n)

        System.out.println("==LinkedList 데이터의 값 조회==");
        search(linkedList, loop, 0);       // 제일 앞의 값 조회:O(1)
        search(linkedList, loop, size / 2);// 중간 위치의 값 조회:O(n)
        search(linkedList, loop, size - 1);// 마지막 위치의 값 조회:O(n)
    }


    /**
     * 제일 앞에 데이터 추가
     */
    private static void addFirst(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            list.add(0, i);     // 제일 앞 위치에 추가
        }

        long endTime = System.currentTimeMillis();
        System.out.println("제일 앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    /**
     * 중간에 데이터 추가
     */
    private static void addMid(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            list.add(i / 2, i); // 중간 위치에 추가
        }

        long endTime = System.currentTimeMillis();
        System.out.println("중간에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    /**
     * 마지막에 데이터 추가
     */
    private static void addLast(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            list.add(i);             // 마지막 위치에 추가
        }

        long endTime = System.currentTimeMillis();
        System.out.println("마지막에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    /**
     * 특정 인덱스의 데이터 조회
     */
    private static void getIndex(List<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < loop; i++) {
            list.get(index);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    /**
     * 데이터의 값 조회
     */
    private static void search(List<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("findValue: " + findValue + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
