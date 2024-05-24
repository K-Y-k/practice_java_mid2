package generic.test.ex3;

import generic.test.ex3.unit.Marine;
import generic.test.ex3.unit.Zealot;
import generic.test.ex3.unit.Zergling;

public class UnitPrinterTest {
    /**
     * 제네릭 메서드와 와일드카드를 사용하여 셔틀에 담긴 각 종족의 정보를 출력하라
     */
    public static void main(String[] args) {
        Shuttle<Marine> shuttle1 = new Shuttle<>();
        shuttle1.in(new Marine("마린", 40));

        Shuttle<Zergling> shuttle2 = new Shuttle<>();
        shuttle2.in(new Zergling("저글링", 35));

        Shuttle<Zealot> shuttle3 = new Shuttle<>();
        shuttle3.in(new Zealot("질럿", 100));

        // 제네릭 메서드
        UnitPrinter.printV1(shuttle1);

        // 와일드카드
        UnitPrinter.printV2(shuttle2);
    }
}
