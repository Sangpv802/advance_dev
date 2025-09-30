package advance_dev.Ass2.Ass2_3;

public class Motorcycle implements Vehicle {
    private double fuelConsumption;
    private double speed;
    private boolean engineOn;

    public Motorcycle(double fuelConsumption, double initialSpeed) {
        this.fuelConsumption = fuelConsumption;
        this.speed = initialSpeed;
        this.engineOn = false;
    }

    @Override
    public void startEngine() {
        engineOn = true;
        if (speed == 0) {
            speed = 60; // mặc định chạy 60 km/h khi khởi động
        }
        System.out.println("Motorcycle engine started. Speed: " + speed + " km/h");
    }

    @Override
    public void stopEngine() {
        engineOn = false;
        speed = 0;
        System.out.println("Motorcycle engine stopped.");
    }

    @Override
    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public double getSpeed() {
        return speed;
    }
}
