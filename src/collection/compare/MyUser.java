package collection.compare;

/**
 * 비교가 가능한 객체로 설정하기 
 * 1.직접 만든 객체에 Comparable를 상속받고
 * 2.자기 자신과 인수로 넘어온 객체를 비교해서 반환하는 compareTo를 구현하면 된다.
 */
public class MyUser implements Comparable<MyUser> {
    private String id;
    private int age;

    public MyUser(String id, int age) {
        this.id = id;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "id='" + id + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 나이를 기준으로 구현했다.
     * - 현재 객체가 인수로 넘어온 객체보다 더 작으면 음수 ex) -1
     * - 두 객체의 크기가 같으면 0
     * - 현재 객체가 인수로 넘어온 객체보다 더 크면 양수   ex) 1
     */
    @Override
    public int compareTo(MyUser o) {
        return this.age < o.age ? -1: (this.age == o.age ? 0 : 1);
    }
}
