package collection.list;

public class BatchProcessor {
    private final MyList<Integer> list;

    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }
    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++)
        {
            list.add(0, i); //앞에 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}

//`logic(int 에 데이터를 추가한다.size)` 메서드는 매우 복잡한 비즈니스 로직을 다룬다고 가정하자.
//이 메서드는 `list` 의 앞 부분 어떤 `MyList list` 의 구현체를 선택할 지는 실행 시점에 생성자를 통해서 결정한다.
//생성자를 통해서 `MyList` 구현체가 전달된다.
//=>`MyArrayList` 의 인스턴스가 들어올 수도 있고, `MyLinkedList` 의 인스턴스가 들어올 수도 있다.

//이것은 `BatchProcessor` 의 외부에서 의존관계가 결정되어서 `BatchProcessor` 인스턴스에 들어오는 것 같다.
//마치 의존관계가 외부에서 주입되는 것 같다고 해서 이것을 **의존관계 주입**이라 한다.
//참고로 생성자를 통해서 의존관계를 주입했기 때문에 생성자 의존관계 주입이라 한다.

//**의존관계 주입**
//Dependency Injection, 줄여서 DI라고 부른다. 의존성 주입이라고도 부른다.