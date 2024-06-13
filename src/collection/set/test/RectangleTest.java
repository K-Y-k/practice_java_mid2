package collection.set.test;

import java.util.HashSet;
import java.util.Set;

public class RectangleTest {
    public static void main(String[] args) {
        /**
         * RectangleTest의 실행 결과는
         * 너비와 높이가 같은 Rectangle 객체의 인스턴스들은 서로 같다고 판단하여 중복 처리 되었다.
         *
         * 이를 참고하여 Rectangle 클래스를 완성하라
         * Rectangle 클래스는 width, height가 모두 같으면 같은 값으로 정의한다.
         */
        Set<Rectangle> rectangleSet = new HashSet<>();
        rectangleSet.add(new Rectangle(10, 10));
        rectangleSet.add(new Rectangle(20, 20));

        // 중복 너비, 높이인 객체를 추가
        rectangleSet.add(new Rectangle(20, 20));

        for (Rectangle rectangle: rectangleSet) {
            System.out.println("rectangle = " + rectangle);
        }
    }
}
