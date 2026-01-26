package generic.animal;

public class Animal {
    private String name;
    private int size;

    public Animal(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void sound(){
        System.out.println("동물 울음 소리");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}

//이름(`name` ), 크기(`size` ) 정보를 가지는 부모 클래스이다.
//`toString()` 을 IDE를 통해서 오버라이딩 했다.