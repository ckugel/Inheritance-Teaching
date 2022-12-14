package src.AbstractClassExample;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age, "Cat");
    }

    @Override
    public void speak() {
        System.out.println("meow");
    }
}
