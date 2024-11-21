package Problem4;

public class Demo {
    public static void main(String[] args) {
        Scalable[] shapes = {
                new Circle(5),
                new Ellipse(6, 4),
                new Triangle(3, 4, 5),
                new EquilateralTriangle(6)
        };

        System.out.println("Shapes before scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }

        float scaleFactor = 2.0f;

        System.out.println("\nScaling shapes by a factor of " + scaleFactor + ".\n");
        scaleShapes(shapes, scaleFactor);

        System.out.println("Shapes after scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }
    }

    public static void scaleShapes(Scalable[] shapes, float factor) {
        for (Scalable shape : shapes) {
            shape.scale(factor);
        }
    }
}
