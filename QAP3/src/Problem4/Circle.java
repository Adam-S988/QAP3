package Problem4;

class Circle extends Ellipse {
    public Circle(double radius) {
        super(radius, radius);
    }

    @Override
    public String toString() {
        return "Circle - Area: " + area() + ", Perimeter: " + perimeter();
    }
}