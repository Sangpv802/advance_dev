package advance_dev.Ass2.Ass2_3;

public class ElectricCar extends Car implements ElectricVehicle {
    private double batteryLevel; // 0 - 100 %

    public ElectricCar(double fuelConsumption, double batteryLevel) {
        super(fuelConsumption, 0); // tốc độ ban đầu = 0
        this.batteryLevel = batteryLevel;
    }

    @Override
    public double getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public void chargeBattery(double amount) {
        batteryLevel += amount;
        if (batteryLevel > 100) batteryLevel = 100;
        System.out.println("Battery charged. Current level: " + batteryLevel + "%");
    }

    @Override
    public void startEngine() {
        if (batteryLevel <= 5) {
            System.out.println("Battery too low to start engine!");
        } else {
            super.startEngine();
        }
    }
}
