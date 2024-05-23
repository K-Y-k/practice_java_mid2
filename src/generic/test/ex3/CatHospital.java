package generic.test.ex3;

import generic.animal.Cat;

/**
 * - 제네릭 사용전
 * 개 동물만 받을 수 있는 클래스 따로 생성
 * => 타입만 다르고 나머지 중복되는 내용으로 코드 재사용성 X, 타입 안전성 O
 */
public class CatHospital {
    private Cat animal;

    public void set(Cat animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public Cat bigger(Cat target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
