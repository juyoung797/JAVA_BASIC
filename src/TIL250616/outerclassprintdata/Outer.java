package TIL250616.outerclassprintdata;


public class Outer {
    private String data = "Outer data";
    class Inner {
        void printData() {
            System.out.println(data);
        }
    }
    public Inner createInner() {
        return new Inner();
    }
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.createInner();
        inner.printData();
        outer = null; // outer 인스턴스가 null 이 되어도 Inner 인스턴스를 참조하고 있는 inner 는 사라지지 않는다.
        inner.printData();
        inner = null;
        inner.printData();
        System.gc();
    }
}
