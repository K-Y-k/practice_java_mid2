package collection.array;

import java.util.Arrays;

/**
 * 배열을 활용한 리스트를 직접 구현해본 예제
 * - 장점
 * 동적으로 최대 크기를 변경해준다.
 * 
 * - V3
 * 중간에 데이터 추가와 삭제 기능 추가
 *
 - 배열 리스트의 한계
 * 1.임의로 지정한 만큼 크기를 늘리므로
 *   정확한 크기를 미리 알지 못하면 메모리 낭비가 발생한다.
 * 2.값 검색, 제일 앞 또는 중간에 추가 및 삭제면
 *   기존 데이터들을 조회하며 옮겨야 하므로 O(n)이 발생하여 비효율적이다.         *
 *
 * - 배열 리스트의 활용
 * 데이터를 순서대로 입력하고
 * 순서대로 출력하는 경우에 가장 효율적이다.
 *
 * - V3의 한계
 * Object로 담았으므로 타입 안정성이 떨어진다.
 */
public class MyArrayListV3 {
    private static final int DEFAULT_CAPACITY = 5;  // 기본 용량

    private Object[] elementData;                   // 모든 타입의 데이터들을 담을 배열
    private int size = 0;                           // 현재까지 데이터가 저장된 위치


    // 기본 생성자인 경우
    public MyArrayListV3() {
        elementData = new Object[DEFAULT_CAPACITY]; // 처음 생성할 때 기본 크기를 위에 선언한 기본 용량으로 지정
    }

    // 직접 크기를 정의한 생성자인 경우
    public MyArrayListV3(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    // 현재 사이즈 반환
    public int size() {
        return size;
    }

    // 데이터 추가 기능
    public void add(Object e) {
        // 현재까지 저장된 위치가 현재 배열의 크기와 같아지면
        if (size == elementData.length) {
            grow(); // 초과 예외가 발생하지 않도록 크기를 늘린 새로운 배열로 복사하는 메서드 실행
        }

        elementData[size] = e;                     // 현재까지 데이터가 저장된 위치에 값을 넣고
        size++;                                    // 현재까지 데이터가 저장된 위치를 1 올린다.
    }

    // 특정 위치에 데이터 추가 기능
    public void add(int index, Object e) {
        // 현재까지 저장된 위치가 현재 배열의 크기와 같아지면
        if (size == elementData.length) {
            grow(); // 초과 예외가 발생하지 않도록 크기를 늘린 새로운 배열로 복사하는 메서드 실행
        }

        /**
         * 오른쪽으로 데이터 이동 추가
         */
        shiftRightFrom(index);

        /**
         * 입력한 인덱스로 값 변경
         */
        elementData[index] = e;                     // 현재까지 데이터가 저장된 위치에 값을 넣고
        size++;                                    // 현재까지 데이터가 저장된 위치를 1 올린다.
    }

    /**
     * 데이터를 오른쪽으로 이동 메서드 추가
     */
    private void shiftRightFrom(int index) {
        // 한칸씩 뒤로 밀려면 뒤에서부터 돌아야 한다.
        for (int i = size; i > index; i--) {   // 입력한 인덱스까지만 진행한다.
            elementData[i] = elementData[i-1];
        }
    }

    // 크기를 늘린 배열로 변경하는 메서드
    private void grow() {
        // 더 큰 배열을 새로 생성하고
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;

        // 기존 배열의 데이터를 새로 생성한 배열에 복사하고
        // 새로 생성한 배열로 참조값을 바꾼다.
        // Object[] newArr = new Object[newCapacity];
        // for (int i = 0; i < elementData.length; i++) {
        //     newArr[i] = elementData[i];
        // }
        elementData = Arrays.copyOf(elementData, newCapacity);
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

    /**
     * 제거 기능 추가
     */
    public Object remove(int index) {
        Object oldValue = get(index);             // 현재 저장되었던 값을 따로 저장해놓고
        
        // 왼쪽으로 데이터 이동
        shiftLeftFrom(index);

        size--;                                   // 하나를 지우므로 현재까지 저장된 데이터의 크기를 1줄이고
        elementData[size] = null;                 // 왼쪽으로 이동했으므로 끝의 마지막 값을 비워주기
        return oldValue;                          // 반환은 따로 저장한 이전 값으로 반환
    }

    /**
     * 데이터를 왼쪽으로 이동 메서드 추가
     */
    private void shiftLeftFrom(int index) {
        // 한칸씩 앞으로 밀려면 앞에서부터 돌아야 한다.
        for (int i = index; i < size-1; i++) {   // 입력한 인덱스까지만 진행한다.
            elementData[i] = elementData[i+1];
        }
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
