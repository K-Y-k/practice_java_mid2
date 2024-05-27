package collection.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        /**
         * - V3의 한계
         * Object로 담았으므로 타입 안정성이 떨어진다.
         */

        MyArrayListV3 numberList = new MyArrayListV3();

        // 숫자만 입력 하기를 기대
        numberList.add(1);
        numberList.add(1);
        numberList.add("3");  // 실수로 문자로 입력, Object라 담아짐
        System.out.println(numberList);

        // Object를 반환하므로 다운 캐스팅이 동작함
        Integer num1 = (Integer) numberList.get(0);
        Integer num2 = (Integer) numberList.get(1);

        /**
         * 문자였던 3이 꺼내지므로 캐스팅 예외 발생!
         */
        Integer num3 = (Integer) numberList.get(2);
    }
}
