package collection.link;

/**
 * 노드 클래스는 내부에 저장할 데이터인 item과
 * 연결할 노드의 참조값인 next를 가진다.
 */
public class Node {
    // 여기서는 단순하게 하기 위해 접근 제어자 default로 함
    Object item; // 내부에 저장할 데이터
    Node next;   // 다음 연결할 노드의 참조값

    public Node(Object item) {
        this.item = item;
    }

    // IDE 자동 생성한 toString
//    @Override
//    public String toString() {
//        return "Node{" +
//                "item=" + item +
//                ", next=" + next +
//                '}';
//    }
    
    // [A->B->C] 형태로 출력하게 만들기
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node x = this;

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
