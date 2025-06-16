package outerclassprivate;

class OuterClass {
    private class HiddenInner {
        void secret() {
            System.out.println("secret");
        }
    }
    public void reveal() {
        HiddenInner inner = new HiddenInner();
        inner.secret();
    }
}
public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.reveal();
    }
}
