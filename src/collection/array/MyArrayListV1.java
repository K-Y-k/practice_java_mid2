package collection.array;

import java.util.Arrays;

/**
 * 배열을 활용한 리스트를 직접 구현해본 예제
 *
 * - V1의 한계
 * 처음에 주어진 DEFAULT_CAPACITY 크기로 생성하므로
 * 최대 크기의 한계
 */
public class MyArrayListV1 {
    private static final int DEFAULT_CAPACITY = 5;  // 기본 용량

    private Object[] elementData;                   // 모든 타입의 데이터들을 담을 배열
    private int size = 0;                           // 현재까지 데이터가 저장된 위치


    // 기본 생성자인 경우
    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY]; // 처음 생성할 때 기본 크기를 위에 선언한 기본 용량으로 지정
    }

    // 직접 크기를 정의한 생성자인 경우
    public MyArrayListV1(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    // 현재 사이즈 반환
    public int size() {
        return size;
    }

    // 데이터 추가 기능
    public void add(Object e) {
        elementData[size] = e;                     // 현재까지 데이터가 저장된 위치에 값을 넣고
        size++;                                    // 현재까지 데이터가 저장된 위치를 1 올린다.
    }

    // 입력한 인덱스에 따른 값 반환
    public Object get(int index) {
        return elementData[index];
    }

    // 입력한 인덱스와 값에 따른 값 변경
    public Object set(int index, Object element) {
        Object oldValue = get(index);             // 현재 저장되었던 값을 따로 저장해놓고
        elementData[index] = element;             // 입력한 인덱스의 값을 변경하고
        return oldValue;                          // 반환은 따로 저장한 이전 값으로 반환
    }

    // 입력한 갑의 인덱스 찾기
    public int indexOf(Object o) {                // 찾는 값을 매개변수로
        for (int i = 0; i < size; i++) {          // 현재까지 저장된 위치 크기까지만 순체 탐색하여
            if (o.equals(elementData[i])) {       // 조회한 인덱스의 값이 찾는 값과 일치하면
                return i;                         // 현재 조회한 인덱스로 반환
            }
        }
        return -1;                                // 없으면 -1 반환
    }

    public String toString() {
        // [1,2,3,null,null], size=3, capacity=5이 아닌
        // [1,2,3], size=3, capacity=5으로 출력

        // Arrays.copyOf()는 배열을 입력한 길이만큼 짤라서 복사해서 새로 만들어준다.
        // 현재까지 저장된 위치인 size를 넣어서 null은 제외시켰다.
        return Arrays.toString(Arrays.copyOf(elementData, size))
                + " size=" + size + ", capacity=" + elementData.length;
    }
}
