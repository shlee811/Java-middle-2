package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {

        //MyArrayList<Integer> list = new MyArrayList<>();

        MyLinkedList<Integer> list = new MyLinkedList<>();

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000);
    }
}


//`BatchProcessor` 의 생성자에 `MyArrayList` 를 사용할지, `MyLinkedList` 를 사용할지 결정해서 넘겨야 한다.
//이후에 `processor.logic()` 을 호출하면 생성자로 넘긴 자료 구조를 사용해서 실행한다.

//`MyLinkedList` 를 사용한 덕분에 O(n) ==> O(1)로 훨씬 더 성능이 개선 된 것을 확인할 수 있다.
// 데이터가 증가할수록 성능의 차이는 더 벌어진다.