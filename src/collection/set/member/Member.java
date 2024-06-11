package collection.set.member;

import java.util.Objects;

public class Member {
    /**
     * Object에서 제공하는 hashCode()를 재정의해서 사용하는 방법
     *
     * Object에서 제공하는 기능은 참조값을 통한 해시 코드를 구해주므로
     * 같은 객체여도 인스턴스가 다르면 다른 해시코드가 나와서
     * 보통 오버라이딩해서 재정의 한다.
     */
    private String id;

    public Member(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }


    /**
     * equals()와 hashCode()의 동등성 기준을 똑같이 맞춰준다!
     */

    /**
     * id 기준으로 동등성을 적용한 equals()
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id);
    }

    /**
     * id 기준으로 동등성을 적용한 hashCode()
     * id가 같으면 같은 해시 코드로 적용
     */
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
