package generic.test.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        
        /**
         * 오브젝트 메서드 사용
         */
        Object object = GenericMethod.objectMethod(i);


        /**
         * 제네릭 메서드 사용
         */
        // 타입 인자 명시적 전달 : 메서드명 앞에 <지정할 타입>로 명시해준다.
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);

        // 자바 컴파일러는 타입 추론이 가능하여 생략 가능하다. (주로 이 방식 사용)
        Integer integerValue = GenericMethod.numberMethod(10);
        Double doubleValue = GenericMethod.numberMethod(20.0);
    }
}
