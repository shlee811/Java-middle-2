package generic.ex3;

import generic.animal.Animal;
import generic.animal.Dog;

public class AnimalHospitalV2 <T>{

    private T animal;
    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        // T의 타입을 메서드를 정의하는 시점에는 알 수 없다. Object의 기능만 사용 가능
        animal.toString();
        animal.equals(null);

        // 컴파일 오류
        //System.out.println("동물 이름: " + animal.getName());
        //animal.sound();
    }
    public T getBigger(T target) {
        // 컴파일 오류
        //return animal.getSize() > target.getSize() ? animal : target;
        return null;

    }
}

//자바 컴파일러는 어떤 타입이 들어올 지 알 수 없기 때문에 `T` 를 어떤 타입이든 받을 수 있는 모든 객체의 최종 부모인 `Object` 타입으로 가정한다.
//따라서 `Object` 가 제공하는 메서드만 호출할 수 있다.
//원하는 기능을 사용하려면 `Animal` 타입이 제공하는 기능들이 필요한데, 이 기능을 모두 사용할 수 없다.
//여기에 추가로 한가지 문제가 더 있다. 바로 동물 병원에 `Integer` , `Object` 같은 동물과 전혀 관계 없는 타입을 타입인자로 전달 할 수 있다는 점이다.
//우리는 최소한 `Animal` 이나 그 자식을 타입 인자로 제한하고 싶다.