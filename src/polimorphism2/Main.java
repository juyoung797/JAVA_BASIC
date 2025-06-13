package polimorphism2;

abstract class Animal {
    abstract void makeSound();
    public void sleep() {
        System.out.println("자는중...");
    }
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("멍멍");
    }
}
interface flyable {
    void fly();
}
interface layEggs {
    void layEggs();
}
class Bird extends Animal implements flyable, layEggs {
    @Override
    void makeSound() {
        System.out.println("짹짹");
    }
    @Override
    public void fly() {
        System.out.println("날기");
    }
    @Override
    public void layEggs() {
        System.out.println("알 낳기");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        dog.sleep();
        Animal bird = new Bird();
        bird.makeSound();
        bird.sleep();
        if (bird instanceof Bird) {
            Bird bird2 = (Bird) bird;
            bird2.fly();
            bird2.layEggs();
        }
    }
}
