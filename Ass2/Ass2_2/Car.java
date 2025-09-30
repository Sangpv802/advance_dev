package advance_dev.Ass2.Ass2_2;


public class Car implements Vehicle {
    private double speed;

    public Car(double speed) {
        this.speed = speed;
    }

    @Override
    public void start() {
        this.speed = 50.0; // ô tô chạy 50 km/h khi khởi động
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
