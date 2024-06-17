package collection.iterable;

import java.util.Iterator;

/**
 * - Iterable과 Iterator 인터페이스
 * 각 자료 구조의 순회 방법이 달라서
 * 순회하는 방법을 일관성 있게 하는 방법이 필요해서 나온 인터페이스
 *
 * - Iterable
 * 컬렉션이 반복될 수 있음을 정의하는 인터페이스
 * 실제 반복을 수행할 수 있는 Iterator 인터페이스를 반환하는 메서드만 있다.
 * 즉, Iterable을 상속 받은 컬렉션은 반복될 수 있음을 나타내면서 Iterator를 사용하여 순회할 수 있다.
 *
 * - Iterator
 * 다음 요소가 있는지 확인하는 메서드와
 * 다음 요소를 반환하는 메서드를 가지고 있다.
 */
public class MyArrayIterator implements Iterator<Integer> {
    /**
     * 배열을 반복 조회하는 클래스 만들어보기
     */
    private int currentIndex = -1; // 현재까지의 인덱스, -1로 초기화한 이유는 다음 요소로 반환할 때 ++를 한 후 받으므로
    private int[] targetArr;       // 순회를 돌릴 배열


    /**
     * 생성자에 순회하고 싶은 배열을 넣어야 한다.
     */
    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }


    /**
     * 다음 요소가 있는지 확인하는 메서드
     */
    @Override
    public boolean hasNext() {
        // 현재 인덱스가 배열의 마지막 인덱스 보다 작은지 비교하여 다음 요소가 있는지 판단
        return currentIndex < targetArr.length - 1;
    }

    /**
     * 다음 요소를 반환하는 메서드
     */
    @Override
    public Integer next() {
        currentIndex++;                 // 현재 인덱스를 1증가 시키고
        return targetArr[currentIndex]; // 현재 인덱스의 값을 반환
    }
}
