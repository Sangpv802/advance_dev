package advance_dev.Ass2.Ass2_3;

public interface ElectricVehicle extends Vehicle {
    double getBatteryLevel();
    void chargeBattery(double amount);
}
