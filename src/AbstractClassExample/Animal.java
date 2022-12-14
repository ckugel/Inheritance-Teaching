package src.AbstractClassExample;

public abstract class Animal {
    protected String name;
    protected int age;
    protected String species;

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public abstract void speak();

    public String toString() {
        return name + ", " + age + ", " + species;
    }
}
