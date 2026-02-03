package collection.array;

import java.util.Arrays;

public class ArrayMain1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        //index 입력: O(1)
        System.out.println("==index 입력: O(1)==");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));
        //index 변경: O(1)
        System.out.println("==index 변경: O(1)==");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));
        //index 조회: O(1)
        System.out.println("==index 조회: O(1)==");
        System.out.println("arr[2] = " + arr[2]);

        //검색: O(n)
        System.out.println("==배열 검색: O(n)==");
        System.out.println(Arrays.toString(arr));
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]:" + arr[i]);
            if (arr[i] == value) {
                System.out.println(value + " 찾음");
                break;
            }
        }
    }
}

//**배열의 특징**
//배열에서 자료를 찾을 때 인덱스(index)를 사용하면 매우 빠르게 자료를 찾을 수 있다.
//인덱스를 통한 입력, 변경, 조회의 경우 한번의 계산으로 자료의 위치를 찾을 수 있다.

//**배열의 검색**
//배열에 들어있는 데이터를 찾는 것을 검색이라 한다.
//배열에 들어있는 데이터를 검색할 때는 배열에 들어있는 데이터를 하나하나 비교해야 한다.
//이때는 이전과 같이 인덱스를 사용해서 한번에 찾을 수 없다.
//대신에 배열안에 들어있는 데이터를 하나하나 확인해야 한다. 따라서 평균적으로 볼때 배열의 크기가 클 수록 오랜 시간이 걸린다.

//**배열의 크기와 검색 연산**
//배열의 크기 1: `arr[0]` 연산 1회
//배열의 크기 2: `arr[0], arr[1]` 연산 2회
//배열의 크기 3: `arr[0], arr[1], arr[2]` 연산 3회
//배열의 크기 10: `arr[0], arr[1], arr[2] ... arr[9]` 연산 10회
//배열의 크기 1000: `arr[0], arr[1], arr[2] ... arr[999]` 연산 1000회
//배열의 순차 검색은 배열에 들어있는 데이터의 크기 만큼 연산이 필요하다. **배열의 크기가 n이면 연산도 n만큼 필요하다.**