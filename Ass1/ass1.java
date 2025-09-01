class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double distance(Point2D p) {
        return distance(p.x, p.y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Point2D p1 = new Point2D(0, 0);
        Point2D p2 = new Point2D(3, 4);

        System.out.println("Point p1: " + p1);
        System.out.println("Point p2: " + p2);
        System.out.println("The distance p1 -> (5,6): " + p1.distance(5, 6));
        System.out.println("The distance p1 -> p2: " + p1.distance(p2));
        
    }
}
