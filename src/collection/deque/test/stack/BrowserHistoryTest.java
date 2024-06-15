package collection.deque.test.stack;

public class BrowserHistoryTest {
    public static void main(String[] args) {
        /**
         * BrowserHistoryTest와 실행 결과를 참고해서 BrowserHistory 클래스를 완성하자
         * 브라우저의 방문 기록 관리 기능을 개발하자. 다음 기능을 개발해야 한다.
         * - visitPage(): 특정 페이지 방문
         * - goBack()   : 뒤로 가기
         * 
         * 뒤로가기는 가장 나중에 넣은 데이터가 먼저 나오므로 스택 구조를 고려하자
         */
        BrowserHistory browser = new BrowserHistory();


        // 사용자가 웹페이지를 방문하는 시나리오
        browser.visitPage("youtube.com");
        browser.visitPage("google.com");
        browser.visitPage("facebook.com");
        System.out.println();


        // 뒤로 가기 기능을 사용하는 시나리오
        String currentPage1 = browser.goBack();
        System.out.println("currentPage1 = " + currentPage1); // facebook.com

        String currentPage2 = browser.goBack();
        System.out.println("currentPage2 = " + currentPage2); // google.com
    }
}
