package collection.array;

import java.util.Arrays;

public class ArrayMain2 {
    public static void main(String[] args) {
        /**
         * 배열의 특징2 (배열에 데이터를 추가할 때 위치에 따른 성능 변화)
         * - 배열에서 새로운 데이터를 추가하려면
         *   추가하는 위치의 오른쪽 기존 데이터들을 모두 오른쪽으로 대입하여 한칸씩 밀어서 추가할 위치를 확보하고  → O(n)
         *   해당 위치에 새로운 값을 넣어준다. → O(1)
         *   → O(n+1) = O(n)
         *
         * - 마지막 위치에 추가하는 경우는
         *   배열의 길이가 마지막 위치라서 한번의  계산으로 위치를 찾고 넣어주고 기존 배열은 이동할 필요가 없으므로 O(n)이다.
         */
        /**
         * - 배열의 한계
         *   1. 인덱스 없이는 반복문으로 일일히 값을 비교해서 검색해야 한다.
         *
         *   2. 배열의 크기는 생성하는 시점에 미리 정해야 한다.
         *      즉, 동적으로 변경할 수 없다.
         *
         *      ex) 이벤트 참여자가 1000명으로 예상되어 1000개를 만들었으나
         *          10000명 참여하여 많은 유저가 참여하지 못하는 문제 발생하거나
         *          100명 참여하면 나머지 메모리 낭비가 발생
         */
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

        // 배열의 첫번째 위치에 추가
        // 기존 배열의 데이터 전체를 1칸씩 뒤로 밀고(O(n)) 배열의 첫번째 위치에 추가(O(1))
        // O(n+1) = O(n)
        System.out.println("배열의 첫번째 위치에 3 추가 O(n)");
        int newValue = 3;
        addFirst(arr, newValue);
        System.out.println(Arrays.toString(arr));

        // index 위치에 추가
        // 특정 인덱스의 오른쪽의 기존 배열의 데이터 전체를 1칸씩 뒤로 밀고(O(n)) 배열의 특정 인덱스 위치에 추가(O(1))
        // O(n+1) = O(n)
        System.out.println("배열의 특정 인덱스 위치(2)에 4 추가 O(n)");
        int index = 2;
        int value = 4;
        addAtFirst(arr, index, value);
        System.out.println(Arrays.toString(arr));

        // 배열의 마지막 위치에 추가
        System.out.println("배열의 마지막 위치에 5 추가 O(1)");
        addLast(arr, 5);
    }

    /**
     * 첫번째 요소에 값을 추가할 경우
     */
    private static void addFirst(int[] arr, int newValue) {
        // 한칸씩 뒤로 밀려면 뒤에서부터 돌아야 한다.
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i-1];
        }

        // 첫번째 위치에 새로운 데이터 추가
        arr[0] = newValue;
    }

    /**
     * 특정 인덱스에 값을 추가할 경우
     */
    private static void addAtFirst(int[] arr, int index, int newValue) {
        // 한칸씩 뒤로 밀려면 뒤에서부터 돌아야 한다.
        // 특정 인덱스까지만 진행한다.
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i-1];
        }

        // 특정 인덱스 위치에 새로운 데이터 추가
        arr[index] = newValue;
    }

    /**
     * 마지막 요소에 값을 추가할 경우
     */
    private static void addLast(int[] arr, int newValue) {
        // 배열의 길이-1이 마지막 위치이므로 한번의 연산을 적용 가능
        arr[arr.length-1] = newValue;
    }
}
