package collection.set.member;

import java.util.Objects;

/**
 * 해시 자료 구조를 사용하려면 hashCode()도 중요하지만
 * 해시 충돌할 때 같은 값인지 검증 처리를 위해
 *  equals()도 반드시 재정의 해야 한다.
 *
 *  - hashCode()만 구현한 경우
 */
public class MemberOnlyHash {
    private String id;

    public MemberOnlyHash(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "MemberOnlyHash{" +
                "id='" + id + '\'' +
                '}';
    }
}
