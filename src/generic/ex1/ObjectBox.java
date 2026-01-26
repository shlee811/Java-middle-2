package generic.ex1;

public class ObjectBox {
    private Object value;

    public void set(Object object) {
        this.value = object;
    }
    public Object get() {
        return value;
    }
}


//다형성을 통한 중복 해결 시도
//`Object` 는 모든 타입의 부모이다. 따라서 다형성(다형적 참조)를 사용해서 이 문제를 간단히 해결할 수 있을 것 같다.

//내부에 `Object 상의 모든 타입을 `ObjectBox` 에 보관할 수 있다.
//value` 를 가지고 있다. `Object` 는 모든 타입의 부모이다. 부모는 자식을 담을 수 있으므로 세