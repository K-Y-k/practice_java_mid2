package collection.map.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        /**
         * map1과 map2에 공통으로 들어있는 키를 찾고 그 갑의 합을 구해라
         */
        // 한번에 값 넣는 방식 Map.of()이므로 무조건 Map으로 받아야한다.
        // 주의점: Map의 값들을 수정할 수 없다.(불변)
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);
        //map1.put("A", 10);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        // 코드 작성
        HashMap<String, Integer> commonMap = new HashMap<>();

        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                int commonTotal = map1.get(key) + map2.get(key);
                commonMap.put(key, commonTotal);
            }
        }

        System.out.println(commonMap);
    }
}
