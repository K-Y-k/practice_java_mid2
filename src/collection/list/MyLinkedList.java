package collection.list;


/**
 * 직접 구현한 단일 연결 리스트에 추상화한 리스트 인터페이스에 상속
 *
 * - 장점
 * 1.동적으로 크기를 하나씩 늘려 메모리 낭비가 없다.
 * 2.제일 앞에 데이터 추가는 성능이 좋고
 *   중간 위치의 추가/삭제에 대한 성능 문제를 어느정도 극복할 수 있다.
 *   배열은 기존 데이터들을 일일히 옮기는 연산을 했지만
 *   연결 리스트는 참조만 바꿔주는 연산만 하면 되기 때문이다.
 *
 * - 단점
 * 1.인덱스 조회와 마지막에 데이터 추가는
 *   다음 노드를 하나씩 조회하며 찾아야 하므로 성능이 나쁘다. (O(n))
 */
public class MyLinkedList<E> implements MyList<E> {
    /**
     * 중첩 클래스로 선언한 Node<E>로 적용
     */
    private Node<E> first;    // 노드
    private int size = 0;     // 현재까지 저장된 데이터의 크기


    /**
     * 추상화한 인터페이스의 기능을 오버라이드 한 기능들
     */
    // 끝에 노드 추가
    @Override
    public void add(E e) {
      Node<E> newNode = new Node<>(e);
      if (first == null) {               // 첫번째 노드가 null이면
          first = newNode;               // 첫번째 노드에 추가하고
      }
      else {                             // 그외는
          Node<E> lastNode = getLastNode(); // 마지막 노드 조회 메서드를 통해 현재의 마지막 노드를 찾은 후
          lastNode.next = newNode;       // 현재의 마지막 노드의 다음 노드의 참조값에 넣는다.
      }

      size++;                            // 추가했으므로 현재까지 저장된 크기 1증가
    }

    // 마지막 노드 찾는 메서드
    private Node<E> getLastNode() {
        Node<E> x = first;            // 첫번째 노드를 넣고

        while (x.next != null) {   // 다음 노드가 null일 때까지
            x = x.next;            // 다음 노드로 이동하면
        }

        return x;                  // 마지막 노드가 되어 반환
    }


    // 제일 앞과 중간의 데이터 추가
    @Override
    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);               // 입력받은 데이터의 노드를 생성하고

        if (index == 0) {                         // 입력받은 인덱스가 제일 앞일 경우
            newNode.next = first;                 // 신규 노드의 다음 노드를 기존 제일 앞의 노드로 적용해주고
            first = newNode;                      // 제일 앞의 노드 참조값을 새로 넣은 노드로 바꾸어준다.
        }
        else {                                    // 입력받은 인덱스가 중간일 경우
            Node<E> prev = getNode(index - 1); // 입력받은 인덱스의 직전 노드를 찾고
            newNode.next = prev.next;             // 신규 노드의 다음 노드를 직전 노드의 다음 노드로 연결해주고
            prev.next = newNode;                  // 직전 노드의 다음 노드를 신규 노드로 연결해준다.
        }

        size++;
    }


    // 제일 앞과 중간의 데이터 삭제
    @Override
    public E remove(int index) {
        Node<E> removeNode = getNode(index);         // 입력한 인덱스의 노드를 찾아주고
        E removedItem = removeNode.item;     // 삭제할 노드 꺼내오기
        
        if (index == 0) {                         // 입력받은 인덱스가 제일 앞일 경우
            first = removeNode.next;              // 제일 앞의 노드를 삭제할 노드의 다음 노드로 지정
        } else {
            Node<E> prev = getNode(index - 1); // 입력받은 인덱스의 직전 노드를 찾고
            prev.next = removeNode.next;          // 직전 노드의 다음 노드를 삭제할 노드의 다음 노드와 연결해준다.
        }

        removeNode.item = null;                   // 삭제 노드의 값을 초기화
        removeNode.next = null;                   // 삭제 노드의 다음 노드 초기화
        size--;                                   // 삭제했으므로 저장된 크기 1줄임
        
        return removedItem;                       // 삭제한 노드의 값 반환
    }


    // 특정 index의 값 꺼내기
    @Override
    public E get(int index) {
        Node<E> node = getNode(index); // 입력한 인덱스의 노드를 찾고
        return node.item;           // 반환
    }

    // 특정 index의 노드 조회 메서드
    private Node<E> getNode(int index) {
        Node<E> x = first;

        // 처음부터 특정 인덱스까지 반복하여
        for (int i = 0; i < index; i++) {
            x = x.next; // 다음 노드를 현재 노드로 담기
        }

        return x;
    }


    // 특정 index의 값 변경
    @Override
    public E set(int index, E element) {
        Node<E> x = getNode(index);  // 입력한 인덱스에 대한 노드를 찾고
        E oldValue = x.item; // 변경전 값을 저장해두고
        x.item = element;         // 입력한 값으로 변경하고
        return oldValue;          // 이전 값 반환
    }


    // 몇번째 인덱스인지 검색
    @Override
    public int indexOf(E o) {
        int index = 0;              // 인덱스 초기화
        Node<E> x = first;             // 첫번째 노드를 넣고

        while (x != null) {         // 현재 노드가 null일 때까지
            if (o.equals(x.item)) { // 입력한 값과 일치하면
                return index;       // 현재 인덱스를 반환
            }
            
            x = x.next;             // 다음 노드로 이동
            index++;                // 인덱스 증가
        }

        return -1;                  // 못찾으면 -1로 반환
    }


    // 현재까지 저장된 크기
    @Override
    public int size() {
        return size;
    }


    // IDE 자동 생성한 toString
    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }


    /**
     * 제네릭 타입으로 적용한 Node를
     * 정적 중첩 클래스로 선언 (특정 클래스 안에서만 사용할 때 사용)
     */
    private static class Node<E> {
        // 여기서는 단순하게 하기 위해 접근 제어자 default로 함
        E item;      // 내부에 저장할 데이터
        Node<E> next;   // 다음 연결할 노드의 참조값

        public Node(E item) {
            this.item = item;
        }


        // [A->B->C] 형태로 출력하게 만들기
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> x = this;

            sb.append("[");
            while (x != null) {
                sb.append(x.item);

                if (x.next != null) {
                    sb.append("->");
                }

                x = x.next;
            }
            sb.append("]");

            return sb.toString();
        }
    }
}
