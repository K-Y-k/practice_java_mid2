package generic.genericmethod;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain3 {
    /**
     * 제네릭 타입의 클래스와 제네릭 메서드의 명칭이 같게 사용한 예제
     * - 제네릭 타입의 클래스와 제네릭 메서드에 선언된 타입은 전혀 다른 소속이다.
     */
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);

        Cat returnCat = hospital.printAndReturn(cat);
        System.out.println("returnCat = " + returnCat);
    }
}
