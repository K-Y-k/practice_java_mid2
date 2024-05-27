package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        /**
         * - 배열 리스트의 한계
         * 1.임의로 지정한 만큼 크기를 늘리므로
         *   정확한 크기를 미리 알지 못하면 메모리 낭비가 발생한다.
         * 2.값 검색, 제일 앞 또는 중간에 추가 및 삭제하면
         *   기존 데이터들을 조회하며 옮겨야 하므로 O(n)이 발생하여 비효율적이다.         *
         *
         * - 배열 리스트의 활용
         * 데이터를 순서대로 입력하고
         * 순서대로 출력하는 경우에 가장 효율적이다.
         */
        MyArrayListV3 list = new MyArrayListV3();
        System.out.println(list);
        System.out.println();

        /**
         * 마지막 위치에 추가 = O(1)
         */
        System.out.println("==마지막 위치에 추가==");
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        System.out.println();

        /**
         * 원하는 위치에 추가
         */
        System.out.println("==원하는 위치에 추가==");
        System.out.println("1.끝에 추가 = O(1)");
        list.add(3, "addList");
        System.out.println(list);

        System.out.println("2.제일 앞에 추가 = 최악의 경우 O(n)");
        list.add(0, "addList");
        System.out.println(list);
        System.out.println();

        /**
         * 삭제
         */
        System.out.println("==삭제==");
        System.out.println("1.끝의 값 삭제 = O(1)");
        Object removed1 = list.remove(4);
        System.out.println("list.remove(4) = " + removed1);
        System.out.println(list);

        System.out.println("2.제일 앞의 값 삭제 = 최악의 경우 O(n)");
        Object removed2 = list.remove(0);
        System.out.println("list.remove(0) = " + removed2);
        System.out.println(list);
    }
}
