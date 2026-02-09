package collection.set;

public class MyHashSetV1Main {
    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1(10);
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9); //hashIndex 중복
        System.out.println(set);
        //검색
        int searchValue = 9;
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);
        //삭제
        boolean removeResult = set.remove(searchValue);
        System.out.println("removeResult = " + removeResult);
        System.out.println(set);
    }
}


//이미 해시 알고리즘을 학습할 때 대부분 작성해본 코드를 객체로 변경한 것이어서 이해하는데 크게 어려움은 없을 것이다.
//**생성**: `new MyHashSetV1(10)` 을 사용해서 배열의 크기를 10으로 지정했다. (여기서는 기본 생성자를 사용하지 않았다.)
//**저장**: 실행 결과를 보면 `99` , `9` 의 경우 해시 인덱스가 9로 충돌하게 된다.
//따라서 배열의 같은 9번 인덱스 위치에 저장된 것을 확인할 수 있다. 그리고 그 안에 있는 연결 리스트에 `99`,`9` 가 함께 저장된다.
//**검색**: `9` 를 검색하는 경우 해시 인덱스가 `9` 이다. 따라서 배열의 `9` 번 인덱스에 있는 연결 리스트를 먼저 찾는다.
//해당 연결 리스트에 있는 모든 데이터를 순서대로 비교하면서 `9` 를 찾는다.
//먼저 `99` 와 `9` 를 비교한다. 실패
//다음으로 `9` 와 `9` 를 비교한다. 성공

//`MyHashSetV1` 은 해시 알고리즘을 사용한 덕분에 등록, 검색, 삭제 모두 평균 O(1)로 연산 속도를 크게 개선했다.

//**남은 문제**
//해시 인덱스를 사용하려면 데이터의 값을 배열의 인덱스로 사용해야 한다. 그런데 배열의 인덱스는 0, 1, 2 같은 숫자만 사용할 수 있다.
//"A", "B"와 같은 문자열은 배열의 인덱스로 사용할 수 없다.
//다음 예와 같이 숫자가 아닌 문자열 데이터를 저장할 때, 해시 인덱스를 사용하려면 어떻게 해야할까?


//==>
//문자열 해시 코드
//지금까지 해시 인덱스를 구할 때 숫자를 기반으로 해시 인덱스를 구했다.
//해시 인덱스는 배열의 인덱스로 사용해야 하므로 0, 1, 2, 같은 숫자(양의 정수)만 사용할 수 있다. 따라서 문자를 사용할 수 없다.
//문자 데이터를 기반으로 숫자 해시 인덱스를 구하려면 어떻게 해야 할까?