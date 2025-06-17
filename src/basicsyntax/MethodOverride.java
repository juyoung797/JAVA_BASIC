package basicsyntax;

public class MethodOverride {
    public static void greet() {
        System.out.println("Hello, World!");
    }
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
    public static void greet(String name, int age) {
        System.out.println("Hello, " + name + ", " + age + "!");
    }
}
