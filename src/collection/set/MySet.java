package collection.set;

/**
 * 제네릭과 인터페이스를 도입하여 타입 안전성을 높이기
 */
public interface MySet<E> {
    boolean add(E element);
    boolean remove(E value);
    boolean contains(E value);
}
