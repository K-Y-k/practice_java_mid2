package collection.array;

public class MyArrayListV2Main {
    public static void main(String[] args) {
        MyArrayListV2 list = new MyArrayListV2(2);
        System.out.println(list);
        System.out.println();

        System.out.println("==데이터 추가==");
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);
        System.out.println();

        System.out.println("==기능 사용==");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get() = " + list.get(1));
        System.out.println("list.indexOf('c') = " + list.indexOf("c"));
        System.out.println("list.set(2, 'z') = " + list.set(2, "z"));
        System.out.println(list);
        System.out.println();

        System.out.println("==기존 용량 끝까지 값 넣기==");
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);
        System.out.println();

        /**
         * - DEFAULT_CAPACITY의 범위 초과한 경우
         * 동적으로 더 큰 배열로 생성하고 기존 배열을 복사한 후 참조값을 바꿔치기 했으므로
         * 이제는 예외가 발생하지 않는다.
         */
        System.out.println("==범위 초과(더 큰 배열 새로 생성후 복사후 바꾸기)==");
        list.add("f");
        System.out.println(list);
    }
}
