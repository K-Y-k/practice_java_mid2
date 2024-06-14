package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        /**
         * Map 활용1
         * - 키-값의 쌍을 저장하는 자료구조
         * - 키를 통해 값을 빠르게 검색할 수 있다.
         * - 키는 중복될 수 없지만, 값은 중복을 허용한다.
         * - 순서를 보장하지 않는다.
         */
        Map<String, Integer> studentMap = new HashMap<>();


        /**
         * 키와 값 추가
         */
        studentMap.put("studentA", 90);
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 80);
        studentMap.put("studentD", 100);

        // {studentB=80, studentA=90, studentD=100, studentC=80}
        System.out.println(studentMap);
        System.out.println();


        /**
         * 키의 값 조회
         */
        Integer result = studentMap.get("studentD");
        System.out.println("result = " + result);
        System.out.println();


        /**
         * 키만 꺼낼 때는 .keySet() 사용
         * 키는 중복을 허용하지 않고 순서를 보장하지 않아
         * 같은 특성인 Set으로 담은 것이다.
         */
        System.out.println("KeySet 활용");
        Set<String> keySet = studentMap.keySet();
        for (String key : keySet) {
            Integer value = studentMap.get(key);
            System.out.println("key=" + key + ", value=" + value);

        }
        System.out.println();


        /**
         * 값만 꺼낼 때는 .values() 사용
         * 값들은 중복을 허용하지만 순서를 보장하지 않아
         * List가 아닌 Collection으로 담는다.
         */
        System.out.println("values 활용");
        Collection<Integer> values = studentMap.values();
        for (Integer value : values) {
            System.out.println("value = " + value);

        }
        System.out.println();


        /**
         * 키와 값 모두 활용할 때는 .entrySet() 사용
         * Entry는 키와 값을 하나로 묶은 Map의 내부 인터페이스이다.
         */
        System.out.println("entrySet 활용");
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key=" + key + ", value=" + value);
        }
        System.out.println();

    }
}
