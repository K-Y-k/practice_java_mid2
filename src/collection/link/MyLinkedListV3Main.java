package collection.link;

public class MyLinkedListV3Main {
    /**
     * 제네릭을 적용한 단일 연결 리스트
     */
    public static void main(String[] args) {
        // String 타입
        MyLinkedListV3<String> stringList = new MyLinkedListV3<>();

        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        //stringList.add(4); 다른 타입은 컴파일 오류! 제네릭의 타입 안전성

        String string = stringList.get(0);
        System.out.println("string = " + string);


        // Integer 타입
        MyLinkedListV3<Integer> intList = new MyLinkedListV3<>();

        intList.add(1);
        intList.add(2);
        intList.add(3);

        Integer integer = intList.get(0);
        System.out.println("integer = " + integer);
    }
}
