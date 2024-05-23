package generic.test.ex4;

import generic.animal.Animal;

/**
 * 제네릭 메서드 활용 예제
 */
public class AnimalMethod {
    /**
     * Animal로 제한을 걸어 Animal의 기능까지 사용
     */
    public static <T extends Animal> void checkup(T t) {
        System.out.println("동물 이름: " + t.getName());
        System.out.println("동물 크기: " + t.getSize());
        t.sound();
    }

    public static <T extends Animal> T bigger(T t1, T t2) {
        return t1.getSize() > t2.getSize() ? t1 : t2;
    }
}
