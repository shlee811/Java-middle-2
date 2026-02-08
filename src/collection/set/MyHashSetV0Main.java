package collection.set;

public class MyHashSetV0Main {
    public static void main(String[] args) {
        MyHashSetV0 set = new MyHashSetV0();
        set.add(1); // O(n)
        set.add(2); // O(n)
        set.add(3); // O(n)
        set.add(4); // O(n)
        System.out.println(set);
        boolean result = set.add(4);//중복 데이터 저장
        System.out.println("중복 데이터 저장 결과 = " + result);
        System.out.println(set);
        System.out.println("set.contains(3): " + set.contains(3)); // O(n)
        System.out.println("set.contains(99): " + set.contains(99)); // O(n)
    }
}


//`add()`로 데이터를 추가할 때 셋에 중복 데이터가 있는지 전체 데이터를 항상 확인해야 한다. 따라서 O(n)으로 입력 성능이 나쁘다.
//중복 데이터 검색 O(n) + 데이터 입력 O(1) O(n)`contains()`로 데이터를 찾을 때는 배열에 있는 모든 데이터를 찾고 비교해야 하므로 평균 O(n)이 걸린다.

//**정리**
//우리가 만든 셋은 구조는 단순하지만, 데이터 추가, 검색 모두 O(n)으로 성능이 좋지 않다. 특히 데이터가 많을 수록 효율은 매우 떨어진다.
//검색의 경우 이전에 보았던 `ArrayList` , `LinkedList`도 O(n)이어서 어느정도 받아들 수 있지만, 데이터의 추가가 특히 문제이다.
//데이터를 추가할 때마다 중복 데이터가 있는지 체크하기 위해 셋의 전체 데이터를 확인해야 한다.
//이때 O(n)으로 성능이 떨어진다. 데이터를 추가할 때마다 이렇게 성능이 느린 자료 구조는 사용하기 어렵다.
//결국 중복 데이터를 찾는 부분이 성능의 발목을 잡는 것이다. 이런 부분을 어떻게 개선할 수 있을까?