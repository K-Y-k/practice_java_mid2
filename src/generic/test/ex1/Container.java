package generic.test.ex1;

public class Container<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T value) {
        this.item = value;
    }

    public boolean isEmpty() {
        return item != null;
    }
}
