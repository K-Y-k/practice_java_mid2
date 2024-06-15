package collection.map.test.member;

import java.util.HashMap;

public class MemberRepository {
     private final HashMap<String, Member> map = new HashMap<>();

    public void save(Member member) {
        map.put(member.getId(), member);
    }

    public Member findById(String id) {
        return map.get(id);
    }

    public Member findByName(String name) {
        // Map에 키 값이 없는 파라미터는 어쩔 수 없이 값을 모두 꺼내서 비교할 수 밖에 없다.
        for (Member member : map.values()) {
            if (member.getName().equals(name)) {
                return member;
            }
        }

        return null;
    }

    public void remove(String id) {
        map.remove(id);
    }
}
