package Problem2;

public class Demo {
    public static void main(String[] args) {
        // Test Point class
        Point p1 = new Point(2.5f, 3.0f);
        System.out.println("Point p1: " + p1);

        p1.setXY(5.5f, 7.0f);
        System.out.println("Updated p1: " + p1);
        System.out.println("X coordinate of p1: " + p1.getX());
        System.out.println("Y coordinate of p1: " + p1.getY());

        // Test MoveablePoint class
        MoveablePoint mp1 = new MoveablePoint(2.0f, 3.0f, 1.5f, 2.0f);
        System.out.println("\nMoveablePoint mp1: " + mp1);

        // Move mp1 and display new position
        mp1.move();
        System.out.println("mp1 after move: " + mp1);

        // Update speed and move again
        mp1.setSpeed(0.5f, 1.0f);
        mp1.move();
        System.out.println("mp1 after updating speed and moving again: " + mp1);
    }
}
