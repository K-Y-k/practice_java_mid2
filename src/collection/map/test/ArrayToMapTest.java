package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayToMapTest {
    public static void main(String[] args) {
        /**
         * 상품의 이름과 가격이 2차원 배열로 제공된다.
         * 다음 예제를 참고해서 2차원 배열의 데이터를 Map<String, Integer>로  변경해라
         * 그리고 실행 결과를 참고해서 Map을 출력해라 (출력 순서는 상관 X)
         */
        // 배열은 타입이 하나만 지정이 가능하여 모두 Stirng으로 적용했다.
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        // 주어진 배열로부터 Map 생성 - 코드 작성
        Map<String, Integer> map = new HashMap<>();
        for (String[] product : productArr) {
            map.put(product[0], Integer.valueOf(product[1]));
        }

        // Map의 모든 데이터 출력 - 코드 작성
        // 엔트리로 가져온 방식
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println("제품: " + entry.getKey() + ", 가격: " + entry.getValue());
        }

        // 키로 가져온 방식
        for (String key: map.keySet()) {
            System.out.println("제품: " + key + ", 가격: " + map.get(key));
        }
    }
}
