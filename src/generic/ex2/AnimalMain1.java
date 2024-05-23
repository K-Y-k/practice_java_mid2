package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain1 {
    /**
     * 제네릭에 다양한 타입들을 담아본 예제
     */
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        // Dog 타입
        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog); // 다른 객체의 참조값을 넣을 수 없다.
        Dog findDog = dogBox.get();
        System.out.println("findDog = " + findDog);

        // Cat 타입
        Box<Cat> catBox = new Box<>();
        catBox.set(cat);
        Cat findCat = catBox.get();
        System.out.println("findCat = " + findCat);

        // Animal 타입
        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal);
    }
}
