package generic.test.ex3;

import generic.animal.Animal;

/**
 * - 제네릭 활용 방법 + 타입 매개션수 제한 
 * 1.코드 재사용성 O, 타입 안전성 X
 * 2.추가로 올 수 있는 관련 타입만 제한하여
 *   관련 없는 타입은 올 수 없으면서 제한한 타입의 기능까지 사용가능
 */
public class AnimalHospitalV3<T extends Animal> { // 부모 객체로 상속
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    /**
     * 장점 : T의 타입을 최소한 부모 객체까지 알고 있어 
     *       부모 객체의 기능 + Object의 기능까지 사용 가능해진다.
     */
    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public T bigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
