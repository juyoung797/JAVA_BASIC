package Shape;

class Rectangle extends Shape {
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
