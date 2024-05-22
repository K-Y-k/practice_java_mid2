package generic.ex2;

import generic.ex2.animal.Animal;
import generic.ex2.animal.Cat;
import generic.ex2.animal.Dog;

public class AnimalMain2 {
    /**
     * 본인 객체와 자식 객체들을 모두 담을 수 있다.
     */
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        Box<Animal> animalBox = new Box<>();

        // Animal의 자신과 자식들을 담을 수 있다.
        animalBox.set(animal);
        animalBox.set(dog);
        animalBox.set(cat);

        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal); // 제일 최근에 설정한 고양이
    }
}
