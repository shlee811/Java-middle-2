package generic.ex1;

public class RawTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        //GenericBox<Object> integerBox = new GenericBox<>(); // 권장
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}


//정리하면 로 타입을 사용하지 않아야 한다.
//만약에 `Object` 타입을 사용해야 한다면 다음과 같이 타입 인자로 `Object` 를 지정해서 사용하면 된다.