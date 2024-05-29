package collection.link;

public class MyLinkedListV2Main {
    public static void main(String[] args) {
        /**
         * 단일 연결 리스트의 각 위치에 따른 데이터 추가/삭제 성능
         */
        MyLinkedListV2 list = new MyLinkedListV2();
        System.out.println(list);
        System.out.println();

        System.out.println("==끝에 데이터 추가 O(n)==");
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);
        System.out.println();

        System.out.println("==첫번째 항목에 데이터 추가 O(1)==");
        list.add(0, "d"); // O(1)
        System.out.println(list);
        System.out.println();

        System.out.println("==첫번째 항목에 데이터 삭제 O(1)==");
        list.remove(0); // O(1)
        System.out.println(list);
        System.out.println();

        System.out.println("==중간 항목에 데이터 추가 O(n)==");
        // 특정 인덱스의 값을 반복문으로 찾아야 하기 때문에 O(n)
        list.add(1, "e");
        System.out.println(list);

        System.out.println("==중간 항목에 데이터 삭제 O(n)==");
        // 특정 인덱스의 값을 반복문으로 찾아야 하기 때문에 O(n)
        list.remove(1);
        System.out.println(list);
    }
}
