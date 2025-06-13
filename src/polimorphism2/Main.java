package polimorphism2;

abstract class Animal {
    abstract void makeSound();
    public void sleep() {
        System.out.println("Sleeping...");
    }
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("bark bark");
    }
}
interface flyable {
    void fly(); //인터페이스는 단일 기능을
}
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        dog.sleep();
    }
}
