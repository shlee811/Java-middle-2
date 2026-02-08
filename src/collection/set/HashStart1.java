package collection.set;

import java.util.Arrays;

public class HashStart1 {
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[4];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 5;
        inputArray[3] = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));
        int searchValue = 8;

        //4번 반복 O(n)
        for (int inputValue : inputArray) {
            if (inputValue == searchValue) {
                System.out.println(inputValue);
            }
        }
    }
}

//입력 값은 1, 2, 5, 8이다. 이 값을 배열에 넣고, 배열에서 검색 값 8을 찾아보자.
//이 값을 찾으려면 배열에 들어있는 데이터를 모두 찾아서 값을 비교해야 한다.
//따라서 배열에서 특정 데이터를 찾는 성능은 O(n)으로 느리다. 물론 데이터가많아질 수록 더 느려진다.
//여기서 문제의 핵심은 찾기 성능이 O(n)으로 느리다는 점이다.

