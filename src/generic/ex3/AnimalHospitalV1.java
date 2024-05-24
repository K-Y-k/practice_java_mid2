package generic.ex3;

import generic.animal.Animal;

/**
 * - 다형성을 활용하여 모든 동물을 하나의 클래스로 담은 클래스
 * 코드 재사용성 O, 타입 안전성 X
 */
public class AnimalHospitalV1 {
    private Animal animal;

    public void set(Animal animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public Animal bigger(Animal target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
