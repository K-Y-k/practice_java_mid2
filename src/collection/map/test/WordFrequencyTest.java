package collection.map.test;

import java.util.HashMap;

public class WordFrequencyTest {
    public static void main(String[] args) {
        /**
         * 각각의 단어가 나타난 수를 출력해라
         */
        String text = "orange banana apple apple banana apple";

        // 코드 작성
        HashMap<String, Integer> map = new HashMap<>();
        String[] words = text.split(" ");

        for (String word : words) {
            // 내가 푼 방식
/*
            if (map.containsKey(word)) {
                map.put(word, map.get(word)+1);
            }
            else {
                map.put(word, 1);
            }
*/

            // 복잡한 방식
/*
            Integer count = map.get(word);
            if (count == null) {
                count = 0;
            }
            count++;
*/

            // 간단한 방식 : 넣어준 키의 값이 없을 때 지정한 기본 값 넣어줌
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);
    }
}
