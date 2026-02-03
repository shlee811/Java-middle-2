package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elementData;
    private int size = 0;

    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];     // 리스트(`MyArrayListV1` )를 생성할 때 사용하는 기본 배열의 크기
    }
    public MyArrayListV1(int initialCapacity) {         // 다양한 타입의 데이터를 보관하기 위해 `Object` 배열을 사용한다.
        elementData = new Object[initialCapacity];
    }
    public int size() {                 //리스트의 크기는 `size` 를 사용한다 CAPACITY와 다름 주의
        return size;
    }
    public void add(Object e) {              //리스트에 데이터를 추가한다. 데이터를 추가하면 `size` 가 하나 증가한다.
        elementData[size] = e;
        size++;
    }
    public Object get(int index) {              //인덱스에 있는 항목을 조회한다.
        return elementData[index];
    }
    public Object set(int index, Object element) {          // 인덱스에 있는 항목을 변경한다.
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }
    public int indexOf(Object o) {            //검색 기능이다. 리스트를 순차 탐색해서 인수와 같은 데이터가 있는 인덱스의 위치를 반환한다.

        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;                       //데이터가 없으면 `-1` 을 반환한다.
            }
        }
        return -1;
    }
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size=" +
                size + ", capacity=" + elementData.length;
    }
}
