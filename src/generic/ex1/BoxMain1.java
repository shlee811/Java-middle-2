package generic.ex1;

public class BoxMain1 {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10); // 오토 박싱
        Integer integer = integerBox.get();    // 값으로 받기
        System.out.println(integer);


        StringBox stringBox =new StringBox();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

    }
}

//코드를 보면 먼저 숫자를 보관하는 `IntegerBox` 를 생성하고, 그곳에 숫자 `10` 을 보관하고, 꺼낸 다음에 출력했다.
//참고로 오토 박싱에 의해 `int` 가 `Integer`로 자동 변환된다.
//다음으로 문자열을 보관하는 `StringBox` 를 생성하고 그곳에 문자열 `"hello"` 를 보관하고, 꺼낸 다음에 출력했다.

//**문제**
//이후에 `Double` , `Boolean` 을 포함한 다양한 타입을 담는 박스가 필요하다면 각각의 타입별로 `DoubleBox` ,
//`BooleanBox` 와 같이 클래스를 새로 만들어야 한다. 담는 타입이 수십개라면, 수십개의 `XxxBox` 클래스를 만들어야한다.
//이 문제를 어떻게 해결할 수 있을까?