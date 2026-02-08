package collection.link;

public class Node {
    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

    /*
//IDE 생성 toString()
@Override
public String toString() {
return "Node{" +
"item=" + item +
", next=" + next +
'}';
}
*/

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node x = this;
        sb.append("[");

        while (x != null) {
            sb.append(x.item);
            if (x.next != null)
            {
                sb.append("->");
            }
            x = x.next;}

        sb.append("]");
        return sb.toString();
    }
}


//이전에 작성한 `toString()` 을 주석처리 한다.
//직접 만든 `toString()` 은 연결된 모든 노드를 탐색해서 출력하고 `[A->B->C]` 와 같이 출력한다.
//반복문 안에서 문자를 더하기 때문에 `StringBuilder` 를 사용하는 것이 효과적이다.
//구현은 앞서 살펴본 모든 노드 탐색하기와 같다. while을 사용해서 다음 노드가 없을 때 까지 반복한다.
//`x = x.next` : 탐색의 위치를 다음으로 이동한다. 현재 탐색중인 노드가 `x` 이다. `x.next` 를 통해 `x` 의 참조값을 다음 노드로 변경한다.