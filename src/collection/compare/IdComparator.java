package collection.compare;

import java.util.Comparator;

public class IdComparator implements Comparator<MyUser> {
    @Override
    public int compare(MyUser o1, MyUser o2) {
        // 자바에서 이미 문자 형태여도 어떤 값이 큰지 구현해놓음
        return o1.getId().compareTo(o2.getId());
    }
}
