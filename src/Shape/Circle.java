package Shape;

class Circle extends Shape {
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
