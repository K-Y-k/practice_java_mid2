package collection.list;

/**
 * 직접 구현한 배열 리스트와 연결 리스트의 공통된 기능들을 추상화한 리스트 인터페이스 구현
 */
public interface MyList<E> {
    int size();

    void add(E e);
    void add(int index, E e);

    E get(int index);
    E set(int index, E element);

    E remove(int index);

    int indexOf(E o);
}
