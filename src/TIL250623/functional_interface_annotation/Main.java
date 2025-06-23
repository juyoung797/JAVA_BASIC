package TIL250623.functional_interface_annotation;

@FunctionalInterface
interface Greeting {
    void sayHello(String name);
    // void anotherMethod(); // 컴파일 에러 발생
}

public class Main {
    public static void main(String[] args) {
        Greeting greeting = (name) -> System.out.println("Hello, " + name + "!");
        greeting.sayHello("Alice");
    }
}
