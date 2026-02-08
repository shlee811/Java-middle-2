package collection.set;

import java.util.Arrays;

public class HashStart4 {
    static final int CAPACITY = 10;
    public static void main(String[] args) {
        //{1, 2, 5, 8, 14, 99}
        System.out.println("hashIndex(1) = " + hashIndex(1));
        System.out.println("hashIndex(2) = " + hashIndex(2));
        System.out.println("hashIndex(5) = " + hashIndex(5));
        System.out.println("hashIndex(8) = " + hashIndex(8));
        System.out.println("hashIndex(14) = " + hashIndex(14));
        System.out.println("hashIndex(99) = " + hashIndex(99));
        Integer[] inputArray = new Integer[CAPACITY];
        add(inputArray, 1);
        add(inputArray, 2);
        add(inputArray, 5);
        add(inputArray, 8);
        add(inputArray, 14);
        add(inputArray, 99);
        System.out.println("inputArray = " + Arrays.toString(inputArray));
        //검색
        int searchValue = 14;
        int hashIndex = hashIndex(searchValue);
        System.out.println("searchValue hashIndex = " + hashIndex);
        Integer result = inputArray[hashIndex]; // O(1)
        System.out.println(result);
    }
    private static void add(Integer[] inputArray, int value) {
        int hashIndex = hashIndex(value);
        inputArray[hashIndex] = value;
    }
    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}

//**hashIndex()**
//해시 인덱스를 반환한다.
//해시 인덱스는 입력 값을 계산해서 인덱스로 사용하는 것을 뜻한다. 여기서는 입력 값을 배열의 크기로 나머지 연산해서 구한다.

//**add()**
//해시 인덱스를 먼저 구한다.
//구한 해시 인덱스의 위치에 데이터를 저장한다.

//**조회**
//해시 인덱스를 구하고, 배열에 해시 인덱스를 대입해서 값을 조회한다.
//`inputArray[hashIndex]`

//**정리**
//입력 값의 범위가 넓어도 실제 모든 값이 들어오지는 않기 때문에 배열의 크기를 제한하고, 나머지 연산을 통해 메
//모리가 낭비되는 문제도 해결할 수 있다.
//해시 인덱스를 사용해서 O(1)의 성능으로 데이터를 저장하고, O(1)의 성능으로 데이터를 조회할 수 있게 되었다.
//덕분에 자료 구조의 조회 속도를 비약적으로 향상할 수 있게 되었다.

//**한계 - 해시 충돌**
//그런데 지금까지 설명한 내용은 저장할 위치가 충돌할 수 있다는 한계가 있다.
//예를 들어 1, 11의 두 값은 이렇게 10으로 나누면 같은 값 1이 된다. 둘다 같은 해시 인덱스가 나와버리는 것이다.
//`1 % 10 = 1`
//`11 % 10 = 1`

//다음의 경우도 마찬가지이다.
//`99 % 10 = 9`
//`9 % 10 = 9

//다음시간에는 해시 충돌에 대해 더 알아보고 어떻게 해시 충돌 문제를 해결할 수 있는지 알아보자.