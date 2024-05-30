package collection.list;

/**
 * 각 리스트의 특징에 맞게 사용해보는 예제
 *
 * 만약 수만개의 데이터를 제일 앞에 넣는 코드를 작성할 때
 * 배열 리스트가 아닌 연결 리스트의 구현체로 활용하면 효율적으로 처리가 가능해진다!
 */
public class BatchProcessor {
    /**
     * 구체적인 클래스에 직접 의존하는 방식
     *
     * - 단점
     * 구현체 변경시 해당 클라이언트 코드의 변경이 필요하다.
     */
    // private final MyLinkedList<Integer> list = new MyLinkedList<>();

    /**
     * 추상화한 인터페이스에 의존하여
     * 생성자 시점에서 구현체인 자식을 의존 관계 주입 방식
     * 
     * - 장점
     * 생성자를 통해 외부에서 자식들의 인스턴스를 받아오기 때문에
     * 클라이언트 코드의 변경이 필요하지 않다.
     *
     * 다형성과 추상화를 활용한 방법이다.
     * 추상화에 의존하고 사용되는 구현체를 나중으로 미루므로 재사용성을 높인다.
     *
     * 전략 패턴은 알고리즘을 클라이언트 코드의 변경 없이 쉽게 교체할 수 있다.
     * 이 의존 관계 주입이 전략 패턴의 대표적인 예시 중 하나이다.
     */
    private final MyList<Integer> list;

    // 생성자를 통해 외부에서 자식들의 인스턴스를 받아온다.
    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            list.add(0, i); // 제일 앞에 추가
        }

        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
