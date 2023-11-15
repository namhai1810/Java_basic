package overriding;

public class Animal {
    protected String name;
    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { // setter
        this.name = name;
    }
    public void eat(){
        System.out.println("Animal eat");
    }
    public void makeSound(){
        System.out.println(".........");
    }
    public void sleep(){
        System.out.println("zzzzzzzzzzzzzzzzzzzz");
    }
}
