package collection.set.test;

import java.util.Objects;

/**
 * Rectangle 클래스는 width, height가 모두 같으면 같은 값으로 정의한다.
 */
public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


    /**
     * width와 height를 기준으로 equals()와 hashCode()를 재정의(오버라이드)
     */
    @Override
    public boolean equals(Object o) {
        System.out.println("Rectangle.equals()");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return getWidth() == rectangle.width && height == rectangle.getHeight();
    }

    @Override
    public int hashCode() {
        System.out.println("Rectangle.hashCode()");
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
