package collection.map;

import java.util.*;

public class JavaMain {
    public static void main(String[] args) {
        /**
         * 자바가 제공하는 Map 인터페이스의 HashMap, LinkedHashMap, TreeMap
         */
        Map<String, Integer> hashMap = new HashMap<>();             // O(1)
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(); // O(1)
        Map<String, Integer> treeMap = new TreeMap<>();             // O(log n)

        run(hashMap);        // {A=30, 1=40, B=20, 2=50, C=10} -> 입력한 순서를 보장 안함
        run(linkedHashMap);  // {C=10, B=20, A=30, 1=40, 2=50} -> 키의 입력한 순서를 보장 함
        run(treeMap);        // {1=40, 2=50, A=30, B=20, C=10} -> 키의 데이터 값을 기준으로 정렬
    }

    private static void run(Map<String, Integer> map) {
        System.out.println("MapClass = " + map.getClass());

        map.put("C", 10);
        map.put("B", 20);
        map.put("A", 30);
        map.put("1", 40);
        map.put("2", 50);
        System.out.println("map = " + map);


        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            // 차례로 하나씩 꺼내서
            String key = iterator.next();
            // 출력
            System.out.print(key + "=" + map.get(key) + " ");
        }

        System.out.println();
        System.out.println();
    }
}
