package collection.set.member;

import java.util.Objects;

public class Member {
    private String id;
    public Member(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                '}';
    }
}

//IDE가 제공하는 자동 완성 기능을 사용해서 `equals()` , `hashCode()` 를 생성하자.
//여기서는 `Member` 의 `id` 값을 기준으로 equals 비교를 하고, hashCode도 생성한다.