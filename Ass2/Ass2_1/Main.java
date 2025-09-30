package advance_dev.Ass2.Ass2_1;


// Imports for classes in the same package are not needed
import advance_dev.Ass2.Circle;
import advance_dev.Ass2.Rectangle;
import advance_dev.Ass2.Shape;
import advance_dev.Ass2.Square;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Shape Inheritance Demonstration...\n");

        Circle circle1 = new Circle(5.0, "red", true);
        System.out.println("--- Circle 1 ---");
        circle1.display();
        
        circle1.setRadius(7.5);
        System.out.println("\n--- Circle 1 (After change) ---");
        circle1.display();

        Rectangle rect1 = new Rectangle(4.0, 6.0, "blue", false);
        System.out.println("\n--- Rectangle 1 ---");
        rect1.display();

        Square square1 = new Square(8.0, "green", true);
        System.out.println("\n--- Square 1 ---");
        square1.display();

        System.out.println("\n--- Polymorphism Example ---");
        Shape[] shapes = new Shape[3];
        shapes[0] = circle1;
        shapes[1] = rect1;
        shapes[2] = square1;

        for (Shape shape : shapes) {
            System.out.println("\nProcessing a " + shape.getClass().getSimpleName() + " object:");
            shape.display();
        }
    }
}