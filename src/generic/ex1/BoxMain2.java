package generic.ex1;

public class BoxMain2
{
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get(); //Object -> Integer 캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); //Object -> String 캐스팅
        System.out.println("str = " + str);

        //잘못된 타입의 인수 전달시
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get(); // String -> Integer 캐스팅 예외
        System.out.println("result = " + result);
    }
}

//숫자가 들어가 있을 것으로 예상한 박스에는 문자열이 들어가 있었다.
//결과적으로 다운 캐스팅시에 `String` 을`Integer`로 캐스팅 할 수 없다는 예외가 발생하고 프로그램이 종료된다.

//정리**
//다형성을 활용한 덕분에 코드의 중복을 제거하고, 기존 코드를 재사용할 수 있게 되었다.
//하지만 입력할 때 실수로 원하지 않는 타입이 들어갈 수 있는 타입 안전성 문제가 발생한다.
//예를 들어서 `integerBox` 에는 숫자만 넣어야 하고,`stringBox` 에는 문자열만 입력할 수 있어야 한다.
//하지만 박스에 값을 보관하는 `set()` 의 매개변수가 `Object` 이기 때문에 다른 타입의 값을 입력할 수 있다.
//그리고 반환 시점에도 `Object` 를 반환하기 때문에 원하는 타입을 정확하게 받을 수 없고, 항상 위험한 다운 캐스팅을 시도해야한다.
//결과적으로 이 방식은 타입 안전성이 떨어진다. 지금까지 개발한 프로그램은 코드 재사용과 타입 안전성이라는 2마리 토끼를 한번에 잡을 수 없다.
//코드 재사용을 늘리기 위해 `Object` 와 다형성을 사용하면 타입 안전성이 떨어지는 문제가 발생한다.

//`BoxMain1` : 각각의 타입별로 `IntegerBox` , `StringBox` 와 같은 클래스를 모두 정의
//-코드 재사용X
//-타입 안전성O
//`BoxMain2` : `ObjectBox` 를 사용해서 다형성으로 하나의 클래스만 정의
//-코드 재사용O
//-타입 안전성X