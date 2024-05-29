package collection.link;

public class NodeMain {
    public static void main(String[] args) {
        // 노드 생성하고 연결하기: A -> B -> C
        Node first = new Node("A");        // 첫번째 노드 선언
        first.next = new Node("B");        // 첫번째 노드의 다음 노드를 지정
        first.next.next = new Node("C");   // 첫번째 노드의 다음 노드의 다음 노드를 지정

        // toString으로 연결된 노드 출력하기
        System.out.println("toString으로 연결된 노드 출력하기");
        System.out.println(first);

        System.out.println("노드B부터 연결된 노드 출력하기");
        Node nodeB = first.next;
        System.out.println(nodeB);
        System.out.println();


        // 모든 노드 탐색하기
        System.out.println("모든 노드 탐색하기");
        printAll(first);
        System.out.println();


        // 마지막 노드 조회하기
        System.out.println("마지막 노드 조회하기");
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);
        System.out.println();


        // 특정 index의 노드 조회하기
        System.out.println("특정 index의 노드 조회하기");
        int index = 2;
        Node index2Node = getNode(first, index);
        System.out.println("index2Node = " + index2Node.item);
        System.out.println();


        // 데이터 추가하기
        System.out.println("데이터 추가하기");
        add(first, "D");
        System.out.println(first);
        add(first, "E");
        System.out.println(first);
        add(first, "F");
        System.out.println(first);
    }

    // 모든 노드 탐색 메서드
    private static void printAll(Node node) {
        Node x = node;

        while (x != null) {                     // 현재 노드 참조값이 null이 아닐 때까지
            System.out.println(x.item);         // 현재 노드의 아이템 값 출력
            x = x.next;                         // 다음 노드를 가리킴
        }
    }

    // 마지막 노드 조회 메서드
    private static Node getLastNode(Node node) {
        Node x = node;

        while (x.next != null) {               // 다음 노드가 null일 때까지 반복하면
            x = x.next;                        // 결국 마지막 노드를 담게되고
        }
        return x;                              // 마지막 노드 반환
    }

    // 특정 index의 노드 조회 메서드
    private static Node getNode(Node node, int index) {
        Node x = node;

        // 처음부터 특정 인덱스까지 반복하여
        for (int i = 0; i < index; i++) {
            x = x.next; // 다음 노드를 현재 노드로 담기
        }

        return x;
    }

    // 데이터 추가 메서드
    private static void add(Node node, String item) {
        Node lastNode = getLastNode(node); // 마지막 노드 조회 메서드를 통해 현재의 마지막 노드를 찾은 후
        lastNode.next = new Node(item);    // 현재의 마지막 노드의 다음 노드의 참조값에 넣는다.
    }
}
