package TIL250623.annotation;

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}
class Calculator {
    /**
     * @deprecated Use {@link #addNumber(int, int)} instead.
     */
    @Deprecated
    public int add(int a, int b) {
        return a + b;
    }
    public int addNumber(int a, int b) {
        return a + b;
    }
}
public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2));;
        System.out.println(calculator.addNumber(2, 4));;

        java.util.List list = new java.util.ArrayList();
        list.add("Hello");
        list.add("World");
        for(Object obj : list) {
            System.out.println(obj);
        }
    }
}
