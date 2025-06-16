package innerclass;

public class Outer {
    private String message = "Hello form the outer class";
    class InnerClass {
        void displayMessage() {
            System.out.println("Inenr says: " + message);
        }
    }
    public void callInnerClass() {
        InnerClass inner = new InnerClass();
        inner.displayMessage();
    }
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.callInnerClass();
    }
}
