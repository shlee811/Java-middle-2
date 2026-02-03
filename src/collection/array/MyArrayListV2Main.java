package collection.array;

public class MyArrayListV2Main {
    public static void main(String[] args) {
        MyArrayListV2 list = new MyArrayListV2(2);
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);
        list.add("f");
        System.out.println(list);
    }
}


//**정리**
//우리가 만든 `MyArrayListV2` 는 정적인 배열과 다르게 크기가 동적으로 변하는 자료 구조이다.
//따라서 데이터의 크기를 미리 정하지 않아도 된다.
//물론 `MyArrayListV2` 의 내부에서는 배열을 사용하지만,`MyArrayListV2` 를 사용하는 개발자들은 이런 부분을 신경쓰지 않아도 된다.