// Remove or update the package declaration if the file is not inside 'advance_dev/Ass2' folder
package advance_dev.Ass2.Ass2_1;
// import advance_dev.Ass2.Shape;


public class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Radius: " + this.radius);
        System.out.println("-------------------------");
    }
}