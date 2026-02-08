package collection.set;

import java.util.Arrays;

public class MyHashSetV0 {
    private int[] elementData = new int[10];
    private int size = 0;

    // O(n)
    public boolean add(int value) {
        if (contains(value)) {
            return false;
        }
        elementData[size] = value;
        size++;
        return true;
    }

    // O(n)
    public boolean contains(int value) {
        for (int data : elementData) {
            if (data == value) {
                return true;
            }
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" + "elementData=" +
                Arrays.toString(Arrays.copyOf(elementData, size)) + ", size=" + size + '}';

    }
}

//예제에서는 단순함을 위해 배열에 데이터를 저장한다. 배열의 크기도 10으로 고정했다.
//`add(value)` : 셋에 중복된 값이 있는지 체크하고, 중복된 값이 있으면 `false` 를 반환한다. 중복된 값이 없으면 값을 저장하고 `true` 를 반환한다.
//`contains(value)` : 셋에 값이 있는지 확인한다. 값이 있으면 `true` 를 반환하고, 값이 없으면 `false` 를 반환한다.
//`toString()` : 배열을 출력하는 부분에 `Arrays.copyOf()` 를 사용해서 배열에 데이터가 입력된 만큼만 출력한다.