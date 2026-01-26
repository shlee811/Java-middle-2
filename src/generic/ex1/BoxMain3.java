package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); //생성 시점에 T의 타입 결정
        integerBox.set(10);
        //integerBox.set("문자100"); // Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.get(); // Integer 타입 반환 (캐스팅 X)
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello"); // String 타입만 허용
        String str = stringBox.get(); // String 타입만 반환
        System.out.println("str = " + str);

        //원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(10.5);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);

        //타입 추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();
    }
}

//참고로 제네릭을 도입한다고 해서 앞서 설명한 `GenericBox<String>`,`GenericBox<Integer>` 와 같은 코드가 실제 만들어지는 것은 아니다.
//대신에 자바 컴파일러가 우리가 입력한 타입 정보를 기반으로 이런 코드가 있다고 가정하고 컴파일 과정에 타입 정보를 반영한다.
//이 과정에서 타입이 맞지 않으면 컴파일 오류가 발생한다.
//더 자세한 내용은 뒤에서 설명한다.

//**타입 추론**
//GenericBox<Integer> integerBox = new GenericBox<Integer>() // 타입 직접 입력
//GenericBox<Integer> integerBox2 = new GenericBox<>() // 타입 추론

//첫번째 줄의 코드를 보면 변수를 선언할 때와 객체를 생성할 때 `<Integer>` 가 두 번 나온다.
//자바는 왼쪽에 있는 변수를 선언할 때의 `<Integer>` 를 보고 오른쪽에 있는 객체를 생성할 때 필요한 타입 정보를 얻을 수 있다.
//따라서 두 번째줄의 오른쪽 코드`new GenericBox<>()` 와 같이 타입 정보를 생략할 수 있다.
//이렇게 자바가 스스로 타입 정보를 추론해서 개발자가 타입 정보를 생략할 수 있는 것을 타입 추론이라 한다.
//참고로 타입 추론이 그냥 되는 것은 아니고, 자바 컴파일러가 타입을 추론할 수 있는 상황에만 가능하다.
//쉽게 이야기해서 읽을 수 있는 타입 정보가 주변에 있어야 추론할 수 있다.

//**정리**
//제네릭을 사용한 덕분에 코드 재사용과 타입 안전성이라는 두 마리 토끼를 모두 잡을 수 있었다.