package generic.ex3;

/**
 * - 제네릭 활용 방법
 * 코드 재사용성 O, 타입 안전성 X
 */
public class AnimalHospitalV2<T> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    /**
     * 문제 : T의 타입을 메서드를 정의하는 시점에는 알 수 없으므로
     *       Object의 기능만 사용 가능
     */
    public void checkup() {
        //System.out.println("동물 이름: " + animal.getName());
        //System.out.println("동물 크기: " + animal.getSize());
        //animal.sound();

        animal.toString();
        animal.equals(null);
    }

    public T bigger(T target) {
        //return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
