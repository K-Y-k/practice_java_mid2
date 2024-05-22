package generic.ex1;

public class BoxMain1 {
    /**
     * 각 클래스의 사용되는 내용은 같으나 담는 타입만 서로 다르다.
     *
     * - 문제점
     * 타입의 차이만으로 중복되는 내용인 클래스들을 분리해서 일일히 생성해야하는 문제점
     */
    public static void main(String[] args) {
        // Integer 타입을 담는 박스 클래스
        IntegerBox integerBox = new IntegerBox();

        integerBox.set(10); // int->Integer로 오토 박싱 적용된 것
        Integer integer = integerBox.get();

        System.out.println("integer = " + integer);


        // String 타입을 담는 박스 클래스
        StringBox stringBox = new StringBox();

        stringBox.set("hello");
        String str = stringBox.get();

        System.out.println("str = " + str);
    }
}
