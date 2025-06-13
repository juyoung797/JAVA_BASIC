package Shape;

public class Main {
    public static void main(String[] args) {
        Shape r = new Rectangle(2, 3);
        Shape c = new Circle(5);
        Shape[] shapes = {r, c};
        for (Shape s : shapes) {
            System.out.println(s.getName() + " 의 면적은 " +  s.area() + "입니다.");
        }
    }
}