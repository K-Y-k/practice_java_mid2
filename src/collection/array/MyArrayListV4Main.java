package collection.array;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrayListV4<String> stringList = new MyArrayListV4<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");

        /**
         * 타입 안전성 향상
         */
        //stringList.add(1); 지정한 타입이 다르므로 컴파일 오류
        String string = stringList.get(0);
        System.out.println("string = " + string);


        MyArrayListV4<Integer> inList = new MyArrayListV4<>();
        inList.add(1);
        inList.add(2);
        inList.add(3);
        Integer integer = inList.get(0);
        System.out.println("integer = " + integer);
    }
}
