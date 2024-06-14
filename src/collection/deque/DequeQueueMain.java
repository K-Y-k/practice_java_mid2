package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueueMain {
    public static void main(String[] args) {
        // ArrayDeque가 단순한 배열 구조라서
        // 동적 노드 링크를 사용하는 LinkedList 보다 훨씬 빠르다.
        Deque<Integer> queue = new ArrayDeque<>();

        /**
         * 덱으로 큐 기능 사용하기
         */

        /**
         * 추가
         */
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);
        System.out.println();


        /**
         * 다음 꺼낼 요소를 확인(꺼내지 않고 조회만)
         */
        System.out.println("queue.peek() = " + queue.peek());
        System.out.println();


        /**
         * 큐 요소 꺼내기
         */
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println(queue);
    }
}
