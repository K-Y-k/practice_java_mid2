package collection.array;

public class MyArrayListV1Main {
    public static void main(String[] args) {
        MyArrayListV1 list = new MyArrayListV1();
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

        System.out.println("==범위 초과==");
        /**
         * - DEFAULT_CAPACITY의 범위 초과한 경우
         * DEFAULT_CAPACITY가 늘어나지 않으면 예외 발생!
         */
        list.add("f");
        System.out.println(list);
    }
}
