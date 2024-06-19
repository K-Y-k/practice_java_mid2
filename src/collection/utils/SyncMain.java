package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncMain {
    public static void main(String[] args) {
        /**
         * - 멀티스레드 동기화
         * 일반 리스트는 멀티스레드 상황에서 문제가 발생할 수 있다.
         *
         * Collections.synchronizedList로 동기화 문제가 발생하지 않는 안전한 리스트로 만들 수 있다.
         * 단, 동기화 작업으로 일반 리스트 보다 성능은 느리다.
         */
        List<Integer> list = new ArrayList<>();
        System.out.println("list.getClass() = " + list.getClass());

        // ex)
        // 쓰레드1에서의 요소 추가 작업 진행중에
        list.add(1);
        list.add(2);
        list.add(3);
        // 쓰레드2에서의 요소 삭제 작업으로 데이터에 혼란이 올 수 있다.
        list.remove(1);


        // 첫번째 쓰레드의 작업이 완전히 끝날 때 까지 
        // 다음 쓰레드의 작업이 대기하여
        // 동기화 문제 해결
        List<Integer> synchronizedList = Collections.synchronizedList(list);
        System.out.println("synchronizedList.getClass() = " + synchronizedList.getClass());
    }
}
