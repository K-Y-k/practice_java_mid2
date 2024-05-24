package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class UnitPrinter {
    // 제네릭 메서드
    public static <T extends BioUnit> void printV1(Shuttle<T> t) {
        T unit = t.out();
        t.showInfo();
        System.out.println("이름: " + unit.getName() + ", Hp: " + unit.getHp());
    }

    // 와일드카드
    // 제네릭 메서드와 동일하게 사용할 수 있으면, 제네릭은 타입을 변환하면서 결정하는 과정이 포함되므로 와일드카드를 사용하자.
    public static void printV2(Shuttle<? extends BioUnit> shuttle) {
        BioUnit unit = shuttle.out();
        shuttle.showInfo();
        System.out.println("이름: " + unit.getName() + ", Hp: " + unit.getHp());
    }
}
