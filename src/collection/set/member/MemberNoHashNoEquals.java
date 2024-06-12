package collection.set.member;

/**
 * 해시 자료 구조를 사용하려면 hashCode()도 중요하지만
 * 해시 충돌할 때 같은 값인지 검증 처리를 위해 
 *  equals()도 반드시 재정의 해야 한다.
 *  
 *  - hashCode()와 equals()를 구현하지 않은 경우
 *  => Object의 기본 기능으로 적용된다.
 */
public class MemberNoHashNoEquals {
    private String id;

    public MemberNoHashNoEquals(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MemberNoHashNoEquals{" +
                "id='" + id + '\'' +
                '}';
    }
}
