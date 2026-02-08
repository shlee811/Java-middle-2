package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        //노드 생성하고 연결하기: A -> B -> C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");
        System.out.println(first);

        //모든 노드 탐색하기
        System.out.println("모든 노드 탐색하기");
        printAll(first);

        //마지막 노드 조회하기
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        //특정 index의 노드 조회하기
        int index = 2;
        Node index2Node = getNode(first, index);
        System.out.println("index2Node = " + index2Node.item);

        //데이터 추가하기
        System.out.println("데이터 추가하기");
        add(first, "D");
        System.out.println(first);
        add(first, "E");
        System.out.println(first);
        add(first, "F");
        System.out.println(first);
    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }
    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }
    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }
    private static void add(Node node, Object param) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(param);
    }
}

//정리
//노드는 내부에 데이터와 다음 노드에 대한 참조를 가지고 있다.
//지금까지 설명한 구조는 각각의 노드가 참조를 통해 연결(Link, 링크) 되어 있다.
//데이터를 추가할 때 동적으로 필요한 만큼의 노드만 만들어서 연결하면 된다. 따라서 배열과 다르게 메모리를 낭비하지 않는다.
//물론 `next` 필드를 통해 참조값을 보관해야 하기 때문에 배열과 비교해서 추가적인 메모리 낭비도 발생한다.
//노드와 연결 구조를 처음 공부하면 이해하기 쉽지않다. 하지만 반복해서 학습하고 또 코드도 직접 만들어보면서
//반드시 이해해야 한다. 이해가 어렵다면 코드를 따라서 종이에 천천히 노드를 그려보면 이해가 될 것이다.
//이렇게 각각의 노드를 연결(링크)해서 사용하는 자료 구조로 리스트를 만들 수 있는데, 이것을 연결 리스트라 한다.