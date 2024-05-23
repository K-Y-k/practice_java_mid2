package generic.test.ex4;

public class GenericMethod {
    // 오브젝트 메서드
    public static Object objectMethod(Object obj) {
        System.out.println("Object print: " + obj);
        return obj;
    }

    // 제네릭 메서드 : 호출하는 시점에 타입이 결정되고
    //               메서드 내부에서만 사용된다.
    public static <T> T genericMethod(T t) {
        System.out.println("Generic print: " + t);
        return t;
    }

    // 타임 매개변수를 제한해서 사용한 제네릭 메서드
    public static <T extends Number> T numberMethod(T t) {
        System.out.println("bound print: " + t);
        return t;
    }

    
    // static 메서드에는 타입 매개변수로 사용할 수 없다.
    // 제네릭 타입은 인스턴스 객체를 생성하는 시점에 정해지는데
    // static 메서드는 인스턴스 단위가 아닌 클래스 단위로 작동하기 때문이다.
    // ex)
    // Class Box<T> {
    //     T instanceMethod(T t) {}       // 가능
    //     static T staticMethod(T t){}   // 불가능
    // }
}
