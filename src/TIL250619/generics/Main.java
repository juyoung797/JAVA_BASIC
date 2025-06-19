package TIL250619.generics;

class Box<T> {
    private T content;
    public Box(T content) {
        this.content = content;
    }
    public T getContent() {
        return content;
    }
    public void setContent(T content) {
        this.content = content;
    }
    public <E> void printContent(E extraInfo) {
        System.out.println("Content: " + content + ", Extra: " + extraInfo);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("---String Box---");
        Box<String> stringBox = new Box<>("나는 커서 훌륭한 박스가 될거야!");
        System.out.println(stringBox.getContent());
        stringBox.setContent("아니야");
        System.out.println(stringBox.getContent());

        System.out.println("---Integer Box---");
        Box<Integer> intBox = new Box<>(12345);
        System.out.println(intBox.getContent());
        intBox.setContent(12345);
        System.out.println(intBox.getContent());
    }
}
