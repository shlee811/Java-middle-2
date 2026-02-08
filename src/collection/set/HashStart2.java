package collection.set;

import java.util.Arrays;

public class HashStart2 {
    public static void main(String[] args) {
        //입력: 1, 2, 5, 8
        //[null, 1, 2, null, null, 5, null, null, 8, null]
        Integer[] inputArray = new Integer[10];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));
        int searchValue = 8;
        Integer result = inputArray[searchValue]; // O(1)
        System.out.println(result);
    }
}

//데이터를 입력할 때 배열에 순서대로 입력하는 것이 아니라, 데이터의 값을 인덱스로 사용해서 저장했다.
//데이터를 조회할 때 데이터의 값을 인덱스로 사용해서 조회한다.
//배열에서 인덱스로 조회하는 것은 O(1)로 매우 빠르다.

//*정리**
//데이터의 값 자체를 배열의 인덱스로 사용했다. 배열에서 인덱스로 데이터를 찾는 것은 매우 빠르다.
//그 덕분에 O(n)의 검색 성능을 O(1)로 획기적으로 개선할 수 있었다.

//**문제**
//입력 값의 범위 만큼 큰 배열을 사용해야 한다. 따라서 배열에 낭비되는 공간이 많이 발생한다.