package advance_dev.Ass2.Ass2_2;


public class Motorcycle implements Vehicle {
    private double speed;

    public Motorcycle(double speed) {
        this.speed = speed;
    }

    @Override
    public void start() {
        this.speed = 80.0; // xe máy chạy 80 km/h khi khởi động
    }

    @Override
    public void stop() {
        this.speed = 0.0;
    }

    @Override
    public double getSpeed() {
        return this.speed;
    }
}
