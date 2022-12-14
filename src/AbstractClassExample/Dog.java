package src.AbstractClassExample;

public class Dog extends Animal {
    protected String breed;

    public Dog(String name, int age, String breed) {
        super(name, age, "Dog");
        this.breed = breed;
    }

    @Override
    public void speak() {
        System.out.println("Bark");
    }

    @Override
    public String toString() {
        return super.toString() + ", " + breed;
    }
}
