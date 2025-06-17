package TIL250616.outerclass;
class OuterClass {
    String outerMessage = "This is from OuterClass";
    private class InnerClass {
        void printMessage() {
            System.out.println(outerMessage);
        }
    }
    InnerClass createInnerClass() {
        return new InnerClass();
    }
}

public class Main {
    String outerMessage = "Hello form Outer";
    class Inner {
        void showMessage() {
            System.out.println(outerMessage);
        }
    }
    public static void main(String[] args) {
        // 1. Outer instance 생성
        Main main = new Main();
        // 2. Inner instance 생성 (outer.new 사용)
        Main.Inner inner = main.new Inner();
        // 3. Inner 클래스 메서드 호출
        inner.showMessage();

        OuterClass outerClass = new OuterClass();
//        OuterClass.InnerClass = Outer.new InnerClass();
//        outerClass.createInnerClass().printMessage();

    }
}
