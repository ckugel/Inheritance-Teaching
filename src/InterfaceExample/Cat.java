package src.InterfaceExample;

public class Cat implements Animal{
    protected int age;
    protected String name;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println("meow");
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
