package collection.set;
import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    private LinkedList<Object>[] buckets;
    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV2() {
        initBuckets();
    }
    public MyHashSetV2(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }
    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }
    public boolean add(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
        if (bucket.contains(value)) {
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }
    public boolean contains(Object searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Object> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }
    public boolean remove(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
        boolean result = bucket.remove(value);
        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }
    private int hashIndex(Object value) {
        //hashCode의 결과로 음수가 나올 수 있다. abs()를 사용해서 마이너스를 제거한다.
        return Math.abs(value.hashCode()) % capacity;
    }
    public int getSize() {
        return size;
    }
    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}

//**private LinkedList<Object>[] buckets**
//`MyHashSetV1` 은 `Integer` 숫자만 저장할 수 있었다. 여기서는 모든 타입을 저장할 수 있도록 `Object` 를 사용한다.
//추가로 저장, 검색, 삭제 메서드의 매개변수도 `Object`로 변경했다.

//**hashIndex()**
//`hashIndex()` 부분이 변경되었다.
//먼저 `Object` 의 `hashCode()` 를 호출해서 해시 코드를 찾는다.
//그리고 찾은 해시 코드를 배열의 크기 (`capacity` )로 나머지 연산을 수행한다. 이렇게 해시 코드를 기반으로 해시 인덱스를 계산해서 반환한다.
//`Object` 의 `hashCode()` 를 사용한 덕분에 모든 객체의 `hashCode()` 를 구할 수 있다.
//물론 다형성에 의해 오버라이딩 된 `hashCode()` 가 호출된다.
//`hashCode()` 의 실행 결과로 음수가 나올 수 있는데, 배열의 인덱스로 음수는 사용할 수 없다.
//`Math.abs()` 를 사용하면 마이너스를 제거해서 항상 양수를 얻을 수 있다.