package collection.deque;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        /**
         * 스택
         * 후입 선출 자료구조
         */

        /**
         * 자바의 Stack 클래스는 Vector라는 자료 구조를 사용한다.
         * 이 자료 구조는 지금은 사용하지 않아
         *
         *  Stack 클래스는 사용하지 말고 Deque를 사용하는 것이 좋다.
         */
        Stack<Integer> stack = new Stack<>();


        /**
         * 추가
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
         * 스택 요소 꺼내기
         */
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println(stack);
    }
}
