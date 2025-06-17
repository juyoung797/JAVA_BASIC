package TIL250616.staticmethod;

class Person {
    public static void greet() {
        System.out.println("Hello from static method");
    }
    public void sayHello() {
        System.out.println("Hello from instance method");
    }
}
public class Main {
    public static void main(String[] args) {
        Person.greet();
        Person p = new Person();
        p.sayHello();
    }
}
