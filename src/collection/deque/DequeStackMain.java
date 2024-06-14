package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {
    public static void main(String[] args) {
        /**
         * 덱
         * - 양쪽 끝에서 요소 추가, 제거 할 수 있다.
         * - 즉, 큐와 스택 기능이 모두 포함되어 있다.
         * - 대표적인 구현체는 ArrayDeque, LinkedList가 있다.
         */
        // ArrayDeque가 단순한 배열 구조라서
        // 동적 노드 링크를 사용하는 LinkedList 보다 훨씬 빠르다.
        Deque<Integer> stack = new ArrayDeque<>();

        /**
         * - 덱으로 스택 기능 사용하기
         * 자바의 Stack 클래스는 Vector라는 자료 구조를 사용한다.
         * 이 자료 구조는 지금은 사용하지 않아
         *
         *  Stack 클래스는 사용하지 말고 Deque를 사용하는 것이 좋다.
         */

        /**
         * 데이터 추가
         */
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println();

        
        /**
         * 다음 꺼낼 요소를 확인(꺼내지 않고 조회만)
         */
        System.out.println("stack.peek() = " + stack.peek());
        System.out.println();


        /**
         * 다음 요소 꺼내기
         */
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println();
    }
}
