package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {
    public static void main(String[] args) {
        /**
         * 덱
         * - 양쪽 끝에서 요소 추가, 제거 할 수 있다.
         * - 즉, 큐와 스택 기능이 모두 포함되어 있다.
         * - 대표적인 구현체는 ArrayDeque, LinkedList가 있다.
         */
        // ArrayDeque가 단순한 배열 구조라서
        // 동적 노드 링크를 사용하는 LinkedList 보다 훨씬 빠르다.

        // 100만 건 입력(앞, 뒤 평균)
        // ArrayDeque = 110ms
        // LinkedList = 480ms

        // 100만 건 조회(앞, 뒤 평균)
        // ArrayDeque = 9ms
        // LinkedList = 20ms
        Deque<Integer> deque = new ArrayDeque<>();


        /**
         * 앞, 뒤로 추가
         */
        deque.offerFirst(1);     // 앞에 추가
        System.out.println(deque);

        deque.offerFirst(2);     // 앞에 추가
        System.out.println(deque);

        deque.offerLast(3);      // 뒤에 추가
        System.out.println(deque);

        deque.offerLast(4);      // 뒤에 추가
        System.out.println(deque);
        System.out.println();

        
        /**
         * 앞, 뒤의 다음 꺼낼 요소를 확인(꺼내지 않고 조회만)
         */
        System.out.println("deque.peekFirst() = " + deque.peekFirst()); // 앞 요소 확인
        System.out.println("deque.peekLast() = " + deque.peekLast());   // 뒤 요소 확인
        System.out.println();


        /**
         * 스택 요소 꺼내기
         */
        System.out.println("deque.pollFirst() = " + deque.pollFirst()); // 앞 요소 꺼내기
        System.out.println("deque.pollFirst() = " + deque.pollFirst()); // 앞 요소 꺼내기
        System.out.println("deque.pollLast() = " + deque.pollLast());   // 뒤 요소 꺼내기
        System.out.println("deque.pollLast() = " + deque.pollLast());   // 뒤 요소 꺼내기
        System.out.println(deque);
    }
}
