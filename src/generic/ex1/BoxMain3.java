package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        /**
         * 제네릭을 사용하면
         * 1.코드 재사용과 2.타입 안전성 2가지 모두 해결할 수 있다.
         *
         * 생성 시점에 T의 타입을 결정한다!
         */
        // Integer 타입을 담은 박스 클래스
        GenericBox<Integer> integerBox = new GenericBox<>(); // new 부분에서 <>안의 타입 정보는 생략할 수 있다 = 타입 추론

        integerBox.set(10);
        //integerBox.set("문자");            // 이제는 컴파일 오류가 발생한다! 타입 안전성

        Integer integer = integerBox.get(); // 생성 시점에 결정했으므로 이제는 캐스팅이 필요 없어진다.
        System.out.println("integer = " + integer);


        // String 타입을 담은 박스 클래스
        GenericBox<String> stringBox = new GenericBox<>();

        stringBox.set("문자");
        String str = stringBox.get();

        System.out.println("str = " + str);


        // 원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<>();

        doubleBox.set(10.5);
        Double doubleValue = doubleBox.get();

        System.out.println("doubleValue = " + doubleValue);
    }
}
