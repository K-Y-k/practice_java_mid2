package generic.genericmethod;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    /**
     * 제네릭 메서드 활용 예제
     */
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        AnimalMethod.<Dog>checkup(dog); // 타입 명시
        AnimalMethod.checkup(cat);      // 컴파일러가 타입 추론으로 <>명시 안해줘도 됨

        Dog targetDog = new Dog("큰 멍멍이", 200);
        AnimalMethod.bigger(dog, targetDog);
    }
}
