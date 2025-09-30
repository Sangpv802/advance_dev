package advance_dev.Ass2.Ass2_1;

public abstract class Shape {
    private String color;
    private boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public void display() {
        String filledStatus = this.filled ? "filled" : "not filled";
        System.out.println("--- Shape Information ---");
        System.out.println("Type: " + this.getClass().getSimpleName());
        System.out.println("Color: " + this.color);
        System.out.println("Status: " + filledStatus);
        System.out.println("Area: " + String.format("%.2f", this.getArea()));
        System.out.println("Perimeter: " + String.format("%.2f", this.getPerimeter()));
    }
}