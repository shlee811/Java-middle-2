package collection.set;

public class StringHashMain {
    static final int CAPACITY = 10;
    public static void main(String[] args) {
        //char
        char charA = 'A';
        char charB = 'B';
        System.out.println(charA + " = " + (int)charA);
        System.out.println(charB + " = " + (int)charB);
        //hashCode
        System.out.println("hashCode(A) = " + hashCode("A"));
        System.out.println("hashCode(B) = " + hashCode("B"));
        System.out.println("hashCode(AB) = " + hashCode("AB"));
        //hashIndex
        System.out.println("hashIndex(A) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(B) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(AB) = " + hashIndex(hashCode("AB")));
    }
    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += c;
        }
        return sum;
    }
    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}


//모든 문자는 본인만의 고유한 숫자로 표현할 수 있다. 예를 들어서 `'A'` 는 `65` , `'B'` 는 `66`으로 표현된다.
//가장 단순하게 `char` 형을 `int` 형으로 캐스팅하면 문자의 고유한 숫자를 확인할 수 있다.
//그리고 "AB"와 같은 연속된 문자는 각각의 문자를 더하는 방식으로 숫자로 표현하면 된다. 65 + 66 = 131이다.


//**참고**: 컴퓨터는 문자를 직접 이해하지는 못한다. 대신에 각 문자에 고유한 숫자를 할당해서 인식한다.
//다음 ASCII 코드표를 참고하자. 예를 들어 'A'라는 문자는 숫자 65로 'B'라는 문자를 숫자 66으로 인식한다.
//그리고 문자를 저장할 때도 이런 표를 사용해서 문자를 숫자로 변환해서 저장한다.
//이 부분을 더 자세히 이해하려면 인코딩이라는 개념을 알아야 하는데, 인코딩은 별도로 다룬다.
//지금은 모든 문자가 고유한 숫자를 가지고 있다는 것 정도만 알아두자.