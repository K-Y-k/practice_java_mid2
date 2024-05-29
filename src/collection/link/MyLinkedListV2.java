package collection.link;

/**
 * 직접 구현한 단일 연결 리스트
 * + 각 위치에 따른 데이타 추가/삭제 추가
 */
public class MyLinkedListV2 {
    private Node first;       // 노드
    private int size = 0;     // 현재까지 저장된 데이터의 크기


    // 끝에 노드 추가
    public void add(Object e) {
      Node newNode = new Node(e);
      if (first == null) {               // 첫번째 노드가 null이면
          first = newNode;               // 첫번째 노드에 추가하고
      }
      else {                             // 그외는
          Node lastNode = getLastNode(); // 마지막 노드 조회 메서드를 통해 현재의 마지막 노드를 찾은 후
          lastNode.next = newNode;       // 현재의 마지막 노드의 다음 노드의 참조값에 넣는다.
      }

      size++;                            // 추가했으므로 현재까지 저장된 크기 1증가
    }

    // 마지막 노드 찾는 메서드
    private Node getLastNode() {
        Node x = first;            // 첫번째 노드를 넣고

        while (x.next != null) {   // 다음 노드가 null일 때까지
            x = x.next;            // 다음 노드로 이동하면
        }

        return x;                  // 마지막 노드가 되어 반환
    }


    /**
     * 제일 앞과 중간의 데이터 추가
     */
    public void add(int index, Object e) {
        Node newNode = new Node(e);               // 입력받은 데이터의 노드를 생성하고

        if (index == 0) {                         // 입력받은 인덱스가 제일 앞일 경우
            newNode.next = first;                 // 신규 노드의 다음 노드를 기존 제일 앞의 노드로 적용해주고
            first = newNode;                      // 제일 앞의 노드 참조값을 새로 넣은 노드로 바꾸어준다.
        }
        else {                                    // 입력받은 인덱스가 중간일 경우
            Node prev = getNode(index - 1); // 입력받은 인덱스의 직전 노드를 찾고
            newNode.next = prev.next;             // 신규 노드의 다음 노드를 직전 노드의 다음 노드로 연결해주고
            prev.next = newNode;                  // 직전 노드의 다음 노드를 신규 노드로 연결해준다.
        }

        size++;
    }


    /**
     * 제일 앞과 중간의 데이터 삭제
     */
    public Object remove(int index) {
        Node removeNode = getNode(index);         // 입력한 인덱스의 노드를 찾아주고
        Object removedItem = removeNode.item;     // 삭제할 노드 꺼내오기
        
        if (index == 0) {                         // 입력받은 인덱스가 제일 앞일 경우
            first = removeNode.next;              // 제일 앞의 노드를 삭제할 노드의 다음 노드로 지정
        } else {
            Node prev = getNode(index - 1); // 입력받은 인덱스의 직전 노드를 찾고
            prev.next = removeNode.next;          // 직전 노드의 다음 노드를 삭제할 노드의 다음 노드와 연결해준다.
        }

        removeNode.item = null;                   // 삭제 노드의 값을 초기화
        removeNode.next = null;                   // 삭제 노드의 다음 노드 초기화
        size--;                                   // 삭제했으므로 저장된 크기 1줄임
        
        return removedItem;                       // 삭제한 노드의 값 반환
    }


    // 특정 index의 값 꺼내기
    public Object get(int index) {
        Node node = getNode(index); // 입력한 인덱스의 노드를 찾고
        return node.item;           // 반환
    }

    // 특정 index의 노드 조회 메서드
    private Node getNode(int index) {
        Node x = first;

        // 처음부터 특정 인덱스까지 반복하여
        for (int i = 0; i < index; i++) {
            x = x.next; // 다음 노드를 현재 노드로 담기
        }

        return x;
    }


    // 특정 index의 값 변경
    public Object set(int index, Object element) {
        Node x = getNode(index);  // 입력한 인덱스에 대한 노드를 찾고
        Object oldValue = x.item; // 변경전 값을 저장해두고
        x.item = element;         // 입력한 값으로 변경하고
        return oldValue;          // 이전 값 반환
    }


    // 몇번째 인덱스인지 검색
    public int indexOf(Object o) {
        int index = 0;              // 인덱스 초기화
        Node x = first;             // 첫번째 노드를 넣고

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
}
