package generic.ex2.animal;

public class Cat extends Animal{

    public Cat(String name, int size) {
        super(name, size);
    }

    @Override
    public void sound() {
        System.out.println("냐옹");
    }
}