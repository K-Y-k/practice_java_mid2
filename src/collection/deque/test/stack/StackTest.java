package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackTest {
    public static void main(String[] args) {
        /**
         * 스택에 push()를 통해서 다음 데이터를 순서대로 입력해라
         * "youtube.com"
         * "google.com"
         * "facebook.com"
         * 
         * 스택에 pop()을 통해서 데이터를 깨내고 꺼낸 순서대로 출력해라
         *
         * 입력 순서와 반대로 출력되는 것을 확인할 수 있다.
         */
        Deque<String> stack = new ArrayDeque<>();

        stack.push("youtube.com");
        stack.push("google.com");
        stack.push("facebook.com");


        System.out.println(stack.pop()); // facebook.com
        System.out.println(stack.pop()); // google.com
        System.out.println(stack.pop()); // youtube.com
    }
}
