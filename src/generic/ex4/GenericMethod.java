package generic.ex4;

public class GenericMethod {
    public static Object objMethod(Object obj) {
        System.out.println("object print: " + obj);
        return obj;
    }

    public static <T> T genericMethod(T t) {
        System.out.println("generic print: " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t) {
        System.out.println("bound print: " + t);
        return t;
    }

}


//<제네릭 메서드>
//이번에는 특정 메서드에 제네릭을 적용하는 제네릭 메서드에 대해 알아보자.
//참고로 앞서 살펴본 제네릭 타입과 지금부터 살펴볼 제네릭 메서드는 둘다 제네릭을 사용하기는 하지만 서로 다른 기능을 제공한다.