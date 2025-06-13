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
    abstract static class Shape {
        String name;
        public String getName() {
            return name;
        }
        abstract double area();
    }
    static class Rectangle extends Shape {
        private String name = "Rectangle";
        private int x;
        int y;
        public Rectangle(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public String getName() {
            return name;
        }
        public double area() {
            return x * y;
        }
    }
    static class Circle extends Shape {
        private String name = "Circle";
        int r;
        public Circle(int r) {
            this.r = r;
        }
        public String getName() {
            return name;
        }
        public double area() {
            return Math.PI * r * r;
        }
    }
}