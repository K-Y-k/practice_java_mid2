package generic.ex1;

/**
 * Object 다형성을 활용한 방법
 * - 모든 타입을 담는 Object 클래스 하나만 생성하여 코드 재사용이 가능해졌다.
 * - 각 타입 별로 중복되는 내용의 각 클래스를 생성해야 하는 문제점을 해결
 *
 * - 문제점
 * 값을 설정할 때 실수로 다른 타입의 값을 넣었을 때 Object라서 컴파일 오류 없이 진행되다가
 * 실행할 때 캐스팅 과정에서 예외가 발생하는 문제 = 타입의 안전성 문제
 */
public class BoxMain2 {
    public static void main(String[] args) {
        // Integer 타입을 담은 박스 클래스
        ObjectBox integerBox = new ObjectBox();

        integerBox.set(10);
        Integer integer = (Integer) integerBox.get(); // 다운 캐스팅

        System.out.println("integer = " + integer);


        // String 타입을 담은 박스 클래스
        ObjectBox stringBox = new ObjectBox();

        stringBox.set("hello");
        String str = (String) stringBox.get();        // 다운 캐스팅

        System.out.println("str = " + str);


        // 잘못된 타입의 인수 전달시
        integerBox.set("문자"); // Object라서 모든 타입의 인수가 전달 가능
        Integer result = (Integer) integerBox.get(); // String -> Integer 캐스팅 예외 발생!
        System.out.println("integer = " + result);
    }
}
