package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();
    }
}


//**문제**
//제네릭에서 타입 매개변수를 사용하면 어떤 타입이든 들어올 수 있다.
//따라서 타입 매개변수를 어떤 타입이든 수용할 수 있는 `Object`로 가정하고, `Object` 의 기능만 사용할 수 있다.
//발생한 문제들을 생각해보면 타입 매개변수를 `Animal`로 제한하지 않았기 때문이다. 만약 타입 인자가 모두 `Animal`과 그 자식만 들어올 수 있게 제한한다면 어떨까?
