package collection.array;

import java.util.Arrays;

public class ArrayMain1 {
    public static void main(String[] args) {
        /**
         * 배열의 특징1 (인덱스를 통한 한번의 접근)
         * - 배열에서 자료를 찾을 때 인덱스를 사용하면 매우 빠르게 찾을 수 있다.
         * - 인덱스를 통한 입력/변경/조회의 경우 한번의 계산으로 자료의 위치를 찾을 수 있다.
         *
         *   (중요!)
         *   인덱스를 알면 한번에 찾을 수 있는 이유는 배열은 같은 자료 크기의 공간으로 연속해서 붙어있기 때문에
         *   데이터 양이 수억개로 많아도
         *   배열의 주소 + (자료 크기 * 인덱스 위치)의 한번의 연산으로 접근할 수 있다.
         */
        int[] arr = new int[5];

        // 주어진 index의 배열 값 입력: O(1)
        // 배열의 인덱스가 주어지면 위치는 한번에 찾기 때문에 O(1)인 것
        System.out.println("==index를 통한 입력: O(1)==");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        // 주어진 index의 배열 값 변경: O(1)
        // 배열의 인덱스가 주어지면 위치는 한번에 찾기 때문에 O(1)인 것
        System.out.println("==index를 통한 변경: O(1)==");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        // 주어진 index의 배열 값 조회: O(1)
        // 배열의 인덱스가 주어지면 위치는 한번에 찾기 때문에 O(1)인 것
        System.out.println("==index를 통한 조회: O(1)==");
        System.out.println("arr[2] = " + arr[2]);

        // 배열 값 검색: O(n)
        // 인덱스가 주어진 것이 아니므로
        // 반복문으로 일일히 하나씩 조회하며 찾아야하기 때문에 O(n)이다.
        System.out.println("==배열 검색: O(n)==");
        int value = 10; // 찾을 값

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]: " +arr[i]);

            if (arr[i] == value) {
                System.out.println(value + " 찾음");
                break;
            }
        }
    }
}
