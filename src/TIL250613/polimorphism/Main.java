package TIL250613.polimorphism;
class Animal {
    public void makeSound() {
        System.out.println("animal sound");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("bark");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("meow");
    }
}
class Hamster extends Animal {
    @Override
    public void makeSound() {
        System.out.println("squeak");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal hamster = new Hamster();
        dog.makeSound();
        cat.makeSound();
        hamster.makeSound();
        Animal[] animals = {dog, cat, hamster};
        for (Animal a : animals) {
            a.makeSound();
        }
    }
}