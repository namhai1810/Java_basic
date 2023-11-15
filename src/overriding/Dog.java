package overriding;

public class Dog extends Animal{

    public Dog() {
        super("DOg");
    }

    @Override
    public void eat() {
        System.out.println("An xuong");
    }

    @Override
    public void makeSound() {
        System.out.println("Gau gau");
    }
}
