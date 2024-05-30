package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        // MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> list = new MyLinkedList<>();

        BatchProcessor processor = new BatchProcessor(list);
        
        /**
         * 앞에 추가하는 연산 성능 테스트
         * - 배열 리스트 = 50000번에 2초
         * - 연결 리스트 = 50000번에 0.12초
         */
        processor.logic(50_000);
    }
}
