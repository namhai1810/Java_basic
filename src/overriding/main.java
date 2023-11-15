package overriding;

public class main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.eat();
        cat.eat();
        dog.makeSound();
        cat.makeSound();
    }
}
