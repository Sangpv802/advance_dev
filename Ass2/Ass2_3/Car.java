package advance_dev.Ass2.Ass2_3;

public class Car implements Vehicle {
    private double fuelConsumption; // lít/km
    private double speed;
    private boolean engineOn;

    public Car(double fuelConsumption, double initialSpeed) {
        this.fuelConsumption = fuelConsumption;
        this.speed = initialSpeed;
        this.engineOn = false;
    }

    @Override
    public void startEngine() {
        engineOn = true;
        if (speed == 0) {
            speed = 40; // tốc độ mặc định khi bật động cơ
        }
        System.out.println("Car engine started. Speed: " + speed + " km/h");
    }

    @Override
    public void stopEngine() {
        engineOn = false;
        speed = 0;
        System.out.println("Car engine stopped.");
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
