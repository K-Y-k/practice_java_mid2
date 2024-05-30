package collection.list;

public class MyListPerformanceTest {
    /**
     * 각 리스트의 성능 비교
     */
    public static void main(String[] args) {
        int size = 50_000;
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();

        System.out.println("==ArrayList 데이터 추가==");
        addFirst(new MyArrayList<>(), size);  // 데이터 추가 및 밀기:O(n)
        addMid(new MyArrayList<>(), size);    // 조회:O(1) + 데이터 추가 및 밀기:O(n)
        addLast(arrayList, size);             // 조회:O(1) + 데이터 추가 및 밀기:O(n)

        System.out.println("==LinkedList 데이터 추가==");
        addFirst(new MyLinkedList<>(), size); // 데이터 추가 및 참조 변경: O(1)
        addMid(new MyLinkedList<>(), size);   // 조회:O(n) + 데이터 추가 및 참조 변경:O(1)
        addLast(linkedList, size);            // 조회:O(n) + 데이터 추가 및 참조 변경:O(1)

        System.out.println();

        int loop = 10000;
        System.out.println("==ArrayList 특정 인덱스의 데이터 조회==");
        getIndex(arrayList, loop, 0);         // 제일 앞에서 조회:O(1)
        getIndex(arrayList, loop, size / 2);  // 중간 위치에서 조회:O(1)
        getIndex(arrayList, loop, size - 1);  // 마지막 위치에서 조회:O(1)

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
    private static void addFirst(MyList<Integer> list, int size) {
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
    private static void addMid(MyList<Integer> list, int size) {
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
    private static void addLast(MyList<Integer> list, int size) {
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
    private static void getIndex(MyList<Integer> list, int loop, int index) {
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
    private static void search(MyList<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("findValue: " + findValue + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
