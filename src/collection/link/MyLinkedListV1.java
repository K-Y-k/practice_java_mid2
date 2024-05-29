package collection.link;

/**
 * 직접 구현한 단일 연결 리스트
 */
public class MyLinkedListV1 {
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
