package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();
        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);
        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();
        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 개 병원에 고양이 전달
        // dogHospital.set(cat); // 다른 타입 입력: 컴파일 오류

        // 문제2: 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}

//이번에 만든 코드는 처음에 제시한 다음 요구사항을 명확히 잘 지킨다.
//**요구사항:개 병원은 개만 받을 수 있고, 고양이 병원은 고양이만 받을 수 있어야 한다.**
//여기서는 개 병원과 고양이 병원을 각각 별도의 클래스로 만들었다.
//각 클래스 별로 타입이 명확하기 때문에 개 병원은 개만 받을 수 있고, 고양이 병원은 고양이만 받을 수 있다.
//따라서 개 병원에 고양이를 전달하면 컴파일 오류가 발생한다.
//그리고 개 병원에서 `bigger()`로 다른 개를 비교하는 경우 더 큰 개를 `Dog` 타입으로 반환한다.

//**문제**
//코드 재사용X: 개 병원과 고양이 병원은 중복이 많이 보인다.
//타입 안전성O: 타입 안전성이 명확하게 지켜진다.