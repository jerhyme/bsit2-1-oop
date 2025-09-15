public abstract class Pet {
    protected String name;
    protected int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Pet Name: " + name);
        System.out.println("Age: " + age);
    }

    public abstract void makeSound();
}
