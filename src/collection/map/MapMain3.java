package collection.map;

import java.util.HashMap;

public class MapMain3 {
    public static void main(String[] args) {
        /**
         * Map 활용2
         */
        HashMap<String, Integer> studentMap = new HashMap<>();


        /**
         * 키와 값 추가
         */
        studentMap.put("studentA", 50);
        System.out.println(studentMap);  // {studentA=90}
        System.out.println();


        /**
         * 지정 키가 없는 경우에만 추가
         */
        // 지정 키가 없는 경우에만 추가 방법1
        if (!studentMap.containsKey("studentA")) {
            studentMap.put("studentA", 100);
        }
        System.out.println(studentMap);

        // 지정 키가 없는 경우에만 추가 방법2
        studentMap.putIfAbsent("studentB", 100);
        System.out.println(studentMap);
    }
}
