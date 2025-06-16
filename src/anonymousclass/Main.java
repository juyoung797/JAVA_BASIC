package anonymousclass;
interface Greeting {
    void greet();
}
class GClass implements Greeting {
    public void greet() {}
}
public class Main {

    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            public void greet() {
                System.out.println("Hello World");
            }
        };

        greeting.greet();
    }
}
