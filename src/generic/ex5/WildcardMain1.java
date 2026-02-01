package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));

        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printWildcardV1(dogBox);

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildcardV2(dogBox);

        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);
        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);
    }
}


//두 메서드는 비슷한 기능을 하는 코드이다. 하나는 제네릭 메서드를 사용하고 하나는 일반적인 메서드에 와일드카드를 사용했다.
//와일드카드는 제네릭 타입이나 제네릭 메서드를 정의할 때 사용하는 것이 아니다. `
//Box<Dog>` , `Box<Cat>` 처럼 타입 인자가 정해진 제네릭 타입을 전달 받아서 활용할 때 사용한다.
//와일드카드인 `?` 는 모든 타입을 다 받을 수 있다는 뜻이다.
//다음과 같이 해석할 수 있다. `? == <? extends Object>`
//이렇게 `?` 만 사용해서 제한 없이 모든 타입을 다 받을 수 있는 와일드카드를 비제한 와일드카드라 한다.
//여기에는 `Box<Dog> dogBox` , `Box<Cat> catBox` , `Box<Object> objBox` 가 모두 입력될 수 있다.

//**와일드카드는 제네릭 타입이나, 제네릭 메서드를 선언하는 것이 아니다. 와일드카드는 이미 만들어진 제네릭 타입을 활용할 때 사용한다.


//**제네릭 메서드 vs 와일드카드**
//`printGenericV1()` 제네릭 메서드를 보자. 제네릭 메서드에는 타입 매개변수가 존재한다.
//그리고 특정 시점에 타입 매개변수에 타입 인자를 전달해서 타입을 결정해야 한다. 이런 과정은 매우 복잡하다.
//반면에 `printWildcardV1()` 메서드를 보자. 와일드카드는 일반적인 메서드에 사용할 수 있고, 단순히 매개변수로 제네릭 타입을 받을 수 있는 것 뿐이다.
//제네릭 메서드처럼 타입을 결정하거나 복잡하게 작동하지 않는다.
//단순히 일반 메서드에 제네릭 타입을 받을 수 있는 매개변수가 하나 있는 것 뿐이다.
//제네릭 타입이나 제네릭 메서드를 정의하는게 꼭 필요한 상황이 아니라면, 더 단순한 와일드카드 사용을 권장한다.