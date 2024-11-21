package Problem4;

class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, side, side);
        this.name = "Equilateral Triangle";
    }

    @Override
    public String toString() {
        return "Equilateral Triangle - Area: " + area() + ", Perimeter: " + perimeter();
    }
}