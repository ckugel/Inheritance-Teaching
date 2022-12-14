package src.InterfaceExample;

public class Dog implements Animal {
    protected int age;
    protected String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println("Bark");
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }
}
