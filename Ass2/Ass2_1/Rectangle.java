package advance_dev.Ass2.Ass2_1;
// import advance_dev.Ass2.Shape;


public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Width: " + this.width);
        System.out.println("Height: " + this.height);
        System.out.println("-------------------------");
    }
}