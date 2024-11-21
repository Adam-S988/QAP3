package Problem4;

abstract class Shape implements Scalable{
    String name;

    // Constructor
    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //Methods
    public abstract double area();
    public abstract double perimeter();

    @Override
    public String toString() {
        return name + " - Area: " + area() + ", Perimeter: " + perimeter();
    }
}