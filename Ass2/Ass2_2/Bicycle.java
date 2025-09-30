package advance_dev.Ass2.Ass2_2;

public class Bicycle implements Vehicle {
    private double speed;

    public Bicycle(double speed) {
        this.speed = speed;
    }

    @Override
    public void start() {
        this.speed = 15.0; // xe đạp chạy 15 km/h khi khởi động
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
