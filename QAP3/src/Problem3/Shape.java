package Problem3;

abstract class Shape {
    String name;

    // Constructor
    public Shape(String name) {
        this.name = name;
    }

    //Methods
    public abstract double area();
    public abstract double perimeter();

    @Override
    public String toString() {
        return name + " - Area: " + area() + ", Perimeter: " + perimeter();
    }
}