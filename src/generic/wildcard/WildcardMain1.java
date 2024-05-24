package generic.wildcard;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();
        Box<Animal> animalBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));
        catBox.set(new Cat("야옹이", 50));


        /**
         * 제네릭 메서드
         */
        WildcardEx.printGenericV1(dogBox); // Dog로 타입 추론되어 적용됨
        WildcardEx.printGenericV2(catBox); // Animal과 상속된 객체만 적용가능
        Dog dog = WildcardEx.printAndReturnGeneric(dogBox); // Animal과 상속된 객체만 적용가능 + 해당 객체 반환


        /**
         * 와일드카드
         */
        WildcardEx.printWildcardV1(dogBox);

        // 상한 와일드카드 : 자신 포함 하위 타입 전달 가능
        WildcardEx.printWildcardV2(animalBox); // 자신 허용
        WildcardEx.printWildcardV2(catBox);    // 자신의 자식 허용
        Animal animal = WildcardEx.printAndReturnWildcard(dogBox); // 상한 와일드카드의 단점 자식 객체여도 부모 객체로 사용되고 반환됨


        // 하한 와일드 카드 : 자신 포함 상위 타입 전달 가능
        WildcardEx.writeBox(objectBox); // 자신 허용
        WildcardEx.writeBox(animalBox); // 자신의 부모 허용
        // writeBox(dogBox); 자식 객체라서 컴파일 오류
        // writeBox(catBox);
    }
}
