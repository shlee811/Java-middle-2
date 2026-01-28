package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV3 <T extends Animal>{
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }
    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public T getBigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }

}

//여기서 핵심은 `<T extends Animal>` 이다.
//타입 매개변수 `T` 를 `Animal` 과 그 자식만 받을 수 있도록 제한을 두는 것이다.
// **즉 `T` 의 상한이 `Animal` 이 되는 것이다.