package collection.map;

import java.util.HashMap;

public class MapMain2 {
    public static void main(String[] args) {
        /**
         * Map 활용2
         */
        HashMap<String, Integer> studentMap = new HashMap<>();


        /**
         * 키와 값 추가
         */
        studentMap.put("studentA", 90);
        System.out.println(studentMap);  // {studentA=90}
        System.out.println();

        /**
         * 같은 키로 새로운 값을 추가시
         * 같은 키의 기존 값에서 교체한다!
         */
        studentMap.put("studentA", 100);
        System.out.println(studentMap);  // {studentA=100}
        System.out.println();


        /**
         * 키의 유무 확인
         */
        boolean containsKey = studentMap.containsKey("studentA");
        System.out.println("containsKey = " + containsKey);
        System.out.println();


        /**
         * 키 삭제 시, 키와 값 모두 삭제 된다.
         */
        studentMap.remove("studentA");
        System.out.println(studentMap);
    }
}
