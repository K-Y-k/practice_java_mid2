package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private final Deque<String> stack = new ArrayDeque<>(); // url 관리
    private String currentPage = null; // 현재 페이지 정보


    /**
     * 페이지 방문
     */
    public void visitPage(String url) {
        if (currentPage != null){
            stack.push(url);
        }

        currentPage = url;             // 현재 페이지 새로 갱신
        System.out.println("방문: " + currentPage);
    }

    /**
     * 이전 페이지로 되돌리기
     */
    public String goBack() {
        if (!stack.isEmpty()) {
            currentPage = stack.pop(); // 이전 페이지를 현재 페이지를 새로 갱신
            System.out.println("뒤로 가기: " + currentPage);
            return currentPage;
        }

        return null;
    }
}
