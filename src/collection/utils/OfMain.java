package collection.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {
    public static void main(String[] args) {
        /**
         * 편리한 불변 컬렉션으로 생성
         */
        List<Integer> list = List.of(1, 2, 3);
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "one", 2, "two");


        /**
         *  불변이라 추가/삭제 등의 값 변경을 할 수 없다. UnsupportedOperationException 예외 발생
         */
        //list.add(4);

        System.out.println("list = " + list);
        System.out.println("set = " + set);
        System.out.println("map = " + map);
        System.out.println();

        // 각 불변 클래스의 컬렉션
        System.out.println("List.of class = " + list.getClass()); // class java.util.ImmutableCollections$ListN
        System.out.println("Set.of class = " + set.getClass());   // class java.util.ImmutableCollections$SetN
        System.out.println("Map.of class = " + map.getClass());   // class java.util.ImmutableCollections$MapN
        System.out.println();

        
        /**
         * Arrays.asList() vs List.of()
         * - Arrays.asList()는 자바 1.2부터 존재했고
         *   고정된 크기로 추가/삭제가 불가능하지만
         *   요소들은 set()을 통해 변경할 수 있다.
         *
         * - 즉, 일반적으로 List.of() 사용을 권장하고
         *   Arrays.asList()는 
         *   1.리스트 내부의 요소를 변경해야하는 경우 
         *   2.자바9 이전 버전일 때
         *   3.굉장히 큰 데이터를 가진 배열인 경우에 사용한다.
         */
        List<Integer> arraysAsList = Arrays.asList(1, 2, 3);
        arraysAsList.set(0, 100);
        System.out.println("arraysAsList = " + arraysAsList);
        System.out.println();


        /**
         * Arrays.asList()는 받아온 배열로 리스트를 만들었을 때
         * 해당 리스트에서 요소를 변경하면 받아온 배열의 요소도 같이 변경된다.
         * (받아온 배열의 참조값을 가리키기 때문)
         *
         * 즉, 굉장히 큰 데이터를 가진 배열을 재사용할 때
         * List.of() 보다 Arrays.asList() 방식이 좋을 수 있다.
         */
        Integer[] arr = {1,2,3,4,5};
        List<Integer> arr2 = Arrays.asList(arr);

        arr2.set(1,100);

        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arr2 = " + arr2);
    }
}
